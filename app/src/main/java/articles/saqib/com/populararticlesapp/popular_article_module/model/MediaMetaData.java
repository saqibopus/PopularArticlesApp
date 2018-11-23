package articles.saqib.com.populararticlesapp.popular_article_module.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 */

public class MediaMetaData implements Parcelable{
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("width")
    @Expose
    private Integer width;
    public final static Parcelable.Creator<MediaMetaData> CREATOR = new Creator<MediaMetaData>() {


        @SuppressWarnings({
                "unchecked"
        })
        public MediaMetaData createFromParcel(Parcel in) {
            return new MediaMetaData(in);
        }

        public MediaMetaData[] newArray(int size) {
            return (new MediaMetaData[size]);
        }

    }
            ;

    protected MediaMetaData(Parcel in) {
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.format = ((String) in.readValue((String.class.getClassLoader())));
        this.height = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.width = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public MediaMetaData() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(url);
        dest.writeValue(format);
        dest.writeValue(height);
        dest.writeValue(width);
    }

    public int describeContents() {
        return 0;
    }
}
