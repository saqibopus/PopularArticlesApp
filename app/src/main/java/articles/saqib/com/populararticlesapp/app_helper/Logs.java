package articles.saqib.com.populararticlesapp.app_helper;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;



public class Logs {

    private static String TAG = "s_saqib :: ";

    public static void p(String msg){
        System.out.println(TAG+msg);
    }
    public static void t(Activity activity,String msg){
        Toast.makeText(activity,msg,Toast.LENGTH_SHORT).show();
    }
    public static void t(Context activity, String msg){
        Toast.makeText(activity,msg,Toast.LENGTH_SHORT).show();
    }
    public static void tFinal(Context activity, String msg){
        Toast.makeText(activity,msg,Toast.LENGTH_SHORT).show();
    }

    public static void p(String msg,String msg1){
        Log.e("",TAG + msg + " : " + msg1);
    }

    public static void pClass(String msg,String url, Object c){
        System.out.println(TAG+"-----------"+msg+"-----------");
        System.out.println(TAG+url);
        System.out.println(TAG+new Gson().toJson(c));
        System.out.println(TAG+"-----------"+msg+"-----------");
    }
}
