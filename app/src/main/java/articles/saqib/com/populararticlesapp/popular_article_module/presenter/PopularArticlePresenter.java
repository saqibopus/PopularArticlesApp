package articles.saqib.com.populararticlesapp.popular_article_module.presenter;

import articles.saqib.com.populararticlesapp.app_helper.Logs;
import articles.saqib.com.populararticlesapp.networking.APIClient;
import articles.saqib.com.populararticlesapp.networking.APIInterface;
import articles.saqib.com.populararticlesapp.popular_article_module.contract.PopularArticleContract;
import articles.saqib.com.populararticlesapp.popular_article_module.model.PopularArticleModel;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 *
 */

public class PopularArticlePresenter implements PopularArticleContract.Presenter {

    private PopularArticleContract.View presenter;
    private final CompositeDisposable disposables = new CompositeDisposable();

    public PopularArticlePresenter(PopularArticleContract.View presenter) {
        this.presenter = presenter;
    }

    @Override
    public void requestPopularArticle(String apiKey) {
        disposables.add(getObservable().subscribeWith(getObserver()));
    }


    public Observable<PopularArticleModel> getObservable() {
        return APIClient.getClient().create(APIInterface.class)
                .getPopularArticle("1e4a4f2a02664651b248899fa77f3407")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    private DisposableObserver<PopularArticleModel> getObserver() {
        return new DisposableObserver<PopularArticleModel>() {

            @Override
            public void onNext(PopularArticleModel popularArticleModel) {
                Logs.pClass("Model Data : ","",popularArticleModel);
                presenter.onPopularArticleLoad(true,popularArticleModel.getStatus(),popularArticleModel.getResults());
            }

            @Override
            public void onError(Throwable e) {
                Logs.p("Error : "+e.getMessage());
                presenter.onPopularArticleLoad(false,e.getMessage(),null);
            }

            @Override
            public void onComplete() {
                Logs.p("Complete : ");
            }
        };
    }


    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {
        if (!disposables.isDisposed()){
            disposables.dispose();
        }
    }
}
