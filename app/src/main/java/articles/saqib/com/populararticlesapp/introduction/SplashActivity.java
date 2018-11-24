package articles.saqib.com.populararticlesapp.introduction;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import articles.saqib.com.populararticlesapp.R;
import articles.saqib.com.populararticlesapp.app_helper.Logs;
import articles.saqib.com.populararticlesapp.app_helper.Navigator;
import articles.saqib.com.populararticlesapp.popular_article_module.ArticleActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * Created By : Saqib Shaikh
 * Date : 24-11-2018
 * Purpose / Usage : Splash activity to display introduction of application.
 * Additional Comments:
 */
public class SplashActivity extends AppCompatActivity implements SplashContract.View{
    private SplashContract.Presenter presenter;
    @BindView(R.id.img_splash)
    ImageView imgSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        init();
        loadSplash();
    }

    @Override
    public void init() {
    }

    @Override
    public void showMessage(int type, String message) {

    }

    @Override
    public void setProgressbar(boolean isShow) {

    }

    @Override
    public void navigateMain() {
        Navigator.navigateToArticle(SplashActivity.this,ArticleActivity.class);
    }

    @Override
    public Context getContext() {
        return SplashActivity.this;
    }

    private void loadSplash(){
        presenter = new SplashPresenter(this);
        presenter.getSplashScreen(3000);
    }
}
