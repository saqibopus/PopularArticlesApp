package articles.saqib.com.populararticlesapp.introduction;


import android.os.Handler;
/**
 * Created By : Saqib Shaikh
 * Date : 24-11-2018
 * Purpose / Usage : Presenter class of Splash activity.
 * Additional Comments:
 */
public class SplashPresenter implements SplashContract.Presenter {
    private SplashContract.View presenter;

    public SplashPresenter(SplashContract.View presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getSplashScreen(long time) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (presenter != null) {
                    presenter.navigateMain();
                }
            }
        }, time);
    }
}
