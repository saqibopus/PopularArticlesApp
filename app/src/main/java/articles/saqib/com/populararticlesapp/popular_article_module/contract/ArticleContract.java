package articles.saqib.com.populararticlesapp.popular_article_module.contract;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
/**
 * Created By : Saqib Shaikh
 * Date : 24-11-2018
 * Purpose / Usage : Contract of article Activity.
 * Additional Comments:
 */

public class ArticleContract {
    public interface View {
        void init();
        void showMessage(int type, String message);
        void setProgress(boolean isShow);
        Context getContext();
        void loadFragments(Fragment f);
    }

    public interface Presenter {

        void requestPopularArticle(Bundle b);
        void onResume();
        void onDestroy();
    }
}
