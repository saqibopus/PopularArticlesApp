package articles.saqib.com.populararticlesapp.app_helper;

import android.app.Activity;
import android.content.Intent;

/**
 * Created By : Saqib Shaikh
 * Date : 24-11-2018
 * Purpose / Usage : Navigate to one Activity to another.
 * Additional Comments:
 */

public class Navigator {

    public static void navigateToArticle(Activity activity, Class classs) {
        Intent i = new Intent(activity, classs);
        activity.startActivity(i);
    }

}
