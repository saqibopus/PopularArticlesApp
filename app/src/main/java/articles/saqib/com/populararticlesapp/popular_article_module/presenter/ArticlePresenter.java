package articles.saqib.com.populararticlesapp.popular_article_module.presenter;

import android.os.Bundle;
import articles.saqib.com.populararticlesapp.popular_article_module.PopularArticleFragment;
import articles.saqib.com.populararticlesapp.popular_article_module.contract.ArticleContract;

/**
 * Created By : Saqib Shaikh
 * Date : 24-11-2018
 * Purpose / Usage : Presenter of article Fragment.
 * Additional Comments:
 */

public class ArticlePresenter implements ArticleContract.Presenter {
    private ArticleContract.View presenter;

    public ArticlePresenter(ArticleContract.View presenter) {
        this.presenter = presenter;
    }


    /**
     * This method is user to request popular article fragment.
     */
    @Override
    public void requestPopularArticle(Bundle b) {
        presenter.loadFragments(new PopularArticleFragment().newInstance());
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }
}
