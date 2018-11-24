package articles.saqib.com.populararticlesapp.app_helper;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created By : Saqib Shaikh
 * Date : 24-11-2018
 * Purpose / Usage : Progress Dilog indicator.
 * Additional Comments:
 */

public class ProgressHelper {

    private ProgressDialog progressDialog;
    private static ProgressHelper progressHelper;

    public static ProgressHelper getInstance(){
        if(progressHelper == null){
            progressHelper = new ProgressHelper();
        }
        return progressHelper;
    }

    public ProgressHelper initProgressDilog(Activity activity){
        progressDialog = new ProgressDialog(activity);
        progressDialog.setCancelable(false);
        return this;
    }
    public void initProgressDilog(Context context){
        progressDialog = new ProgressDialog(context);
        progressDialog.setCancelable(false);
    }
    public void show(String message){
        progressDialog.setMessage(message);
        progressDialog.show();
    }
    public void dissmiss(){
        if(progressDialog != null && progressDialog.isShowing())
            progressDialog.dismiss();

    }
}
