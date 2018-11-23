package articles.saqib.com.populararticlesapp.introduction;

import android.content.Context;

/**
 * Created by emxcel on 18/4/18.
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
