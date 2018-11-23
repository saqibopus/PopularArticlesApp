package articles.saqib.com.populararticlesapp.app_helper;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by emxcel on 18/4/18.
 */

public class Navigator {

    public static void navigateToArticle(Activity activity, Class classs) {
        Intent i = new Intent(activity, classs);
        activity.startActivity(i);
    }

}
