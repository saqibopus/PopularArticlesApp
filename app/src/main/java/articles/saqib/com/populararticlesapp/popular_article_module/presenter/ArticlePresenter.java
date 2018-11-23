package articles.saqib.com.populararticlesapp.popular_article_module.presenter;

import android.os.Bundle;

import articles.saqib.com.populararticlesapp.popular_article_module.PopularArticleFragment;
import articles.saqib.com.populararticlesapp.popular_article_module.contract.ArticleContract;

/**
 *
 */

public class ArticlePresenter implements ArticleContract.Presenter {
    private ArticleContract.View presenter;

    public ArticlePresenter(ArticleContract.View presenter) {
        this.presenter = presenter;
    }



    @Override
    public void requestPopularArticle(Bundle b) {
        presenter.loadFragments(new PopularArticleFragment());
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }
}
