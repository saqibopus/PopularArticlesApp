package articles.saqib.com.populararticlesapp.popular_article_module;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import articles.saqib.com.populararticlesapp.R;
import articles.saqib.com.populararticlesapp.popular_article_module.contract.ArticleContract;
import articles.saqib.com.populararticlesapp.popular_article_module.presenter.ArticlePresenter;

public class ArticleActivity extends AppCompatActivity implements ArticleContract.View {
    private ArticleContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_article);
        init();
    }

    @Override
    public void init() {
        presenter = new ArticlePresenter(this);
        presenter.requestPopularArticle(null);
    }

    @Override
    public void showMessage(int type, String message) {

    }

    @Override
    public void setProgress(boolean isShow) {

    }

    @Override
    public Context getContext() {
        return ArticleActivity.this;
    }

    @Override
    public void loadFragments(Fragment f) {

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.layout_fragments, f);
        // or ft.add(R.id.your_placeholder, new FooFragment());
        ft.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}
