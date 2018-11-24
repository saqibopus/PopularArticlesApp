package articles.saqib.com.populararticlesapp.popular_article_module.contract;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import java.util.List;

import articles.saqib.com.populararticlesapp.popular_article_module.model.Results;

/**
 * Created By : Saqib Shaikh
 * Date : 24-11-2018
 * Purpose / Usage : Contract of article Fragment.
 * Additional Comments:
 */
public class PopularArticleContract {
    public interface View {
        void init();
        void showMessage(int type, String message);
        void setProgress(boolean isShow);
        Context getContext();
        void onPopularArticleLoad(boolean isSuccess,String message,List<Results> results);
    }

    public interface Presenter {

        void requestPopularArticle(String apiKey);
        void onResume();
        void onDestroy();
    }
}
