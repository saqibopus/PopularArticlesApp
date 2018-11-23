package articles.saqib.com.populararticlesapp.popular_article_module.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 *
 */

public class PopularArticleModel implements Parcelable{
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("num_results")
    @Expose
    private Integer numResults;
    @SerializedName("results")
    @Expose
    private List<Results> results = null;
    public final static Parcelable.Creator<PopularArticleModel> CREATOR = new Creator<PopularArticleModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public PopularArticleModel createFromParcel(Parcel in) {
            return new PopularArticleModel(in);
        }

        public PopularArticleModel[] newArray(int size) {
            return (new PopularArticleModel[size]);
        }

    }
            ;

    protected PopularArticleModel(Parcel in) {
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.copyright = ((String) in.readValue((String.class.getClassLoader())));
        this.numResults = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.results, (Results.class.getClassLoader()));
    }

    public PopularArticleModel() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Integer getNumResults() {
        return numResults;
    }

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(copyright);
        dest.writeValue(numResults);
        dest.writeList(results);
    }

    public int describeContents() {
        return 0;
    }

}
