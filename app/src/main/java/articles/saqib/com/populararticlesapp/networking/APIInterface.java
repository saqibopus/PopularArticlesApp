package articles.saqib.com.populararticlesapp.networking;

import articles.saqib.com.populararticlesapp.popular_article_module.model.PopularArticleModel;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created By : Saqib Shaikh
 * Date : 24-11-2018
 * Purpose / Usage : This is Api interface which provide methods to fetch data from server using web servive.
 * Additional Comments:
 */

public interface APIInterface {
    @GET("mostviewed/all-sections/7.json?")
    Observable<PopularArticleModel> getPopularArticle(@Query("apikey") String page);
}
