package articles.saqib.com.populararticlesapp.introduction;

import android.content.Context;

/**
 * Created By : Saqib Shaikh
 * Date : 24-11-2018
 * Purpose / Usage : Splash Activity Contract Classes.
 * Additional Comments:
 */

public class SplashContract {
    interface View {
        void init();
        void showMessage(int type,String message);
        void setProgressbar(boolean isShow);
        void navigateMain();
        Context getContext();
    }

    interface Presenter {

        void getSplashScreen(long time);
    }
}
