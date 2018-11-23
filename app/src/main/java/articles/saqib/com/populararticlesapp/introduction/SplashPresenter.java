package articles.saqib.com.populararticlesapp.introduction;


import android.os.Handler;

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
