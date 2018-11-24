package articles.saqib.com.populararticlesapp.popular_article_module.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 *
 */

public class Results implements Parcelable{
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("adx_keywords")
    @Expose
    private String adxKeywords;
    @SerializedName("column")
    @Expose
    private Object column;
    @SerializedName("section")
    @Expose
    private String section;
    @SerializedName("byline")
    @Expose
    private String byline;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("abstract")
    @Expose
    private String _abstract;
    @SerializedName("published_date")
    @Expose
    private String publishedDate;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("asset_id")
    @Expose
    private String assetId;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("des_facet")
    @Expose
    private Object desFacet = null;
    @SerializedName("org_facet")
    @Expose
    private Object orgFacet = null;
    @SerializedName("per_facet")
    @Expose
    private Object perFacet = null;

    public Object getGeoFacet() {
        return geoFacet;
    }

    public void setGeoFacet(Object geoFacet) {
        this.geoFacet = geoFacet;
    }

    @SerializedName("geo_facet")
    @Expose
    private Object geoFacet;

    @SerializedName("media")
    @Expose
    private List<Media> media = null;

    public final static Parcelable.Creator<Results> CREATOR = new Parcelable.Creator<Results>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Results createFromParcel(Parcel in) {
            return new Results(in);
        }

        public Results[] newArray(int size) {
            return (new Results[size]);
        }

    }
            ;

    protected Results(Parcel in) {
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.adxKeywords = ((String) in.readValue((String.class.getClassLoader())));
        this.column = ((Object) in.readValue((Object.class.getClassLoader())));
        this.section = ((String) in.readValue((String.class.getClassLoader())));
        this.byline = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this._abstract = ((String) in.readValue((String.class.getClassLoader())));
        this.publishedDate = ((String) in.readValue((String.class.getClassLoader())));
        this.source = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.assetId = ((String) in.readValue((String.class.getClassLoader())));
        this.views = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.desFacet = ((Object) in.readValue((Object.class.getClassLoader())));
        this.orgFacet= ((Object) in.readValue((Object.class.getClassLoader())));
        this.perFacet = ((Object) in.readValue((Object.class.getClassLoader())));
        this.geoFacet = ((Object) in.readValue((String.class.getClassLoader())));
        in.readList(this.media, (Media.class.getClassLoader()));
    }

    public Results() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAdxKeywords() {
        return adxKeywords;
    }

    public void setAdxKeywords(String adxKeywords) {
        this.adxKeywords = adxKeywords;
    }

    public Object getColumn() {
        return column;
    }

    public void setColumn(Object column) {
        this.column = column;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstract() {
        return _abstract;
    }

    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }


    public Object getDesFacet() {
        return desFacet;
    }

    public void setDesFacet(Object desFacet) {
        this.desFacet = desFacet;
    }

    public Object getOrgFacet() {
        return orgFacet;
    }

    public void setOrgFacet(Object orgFacet) {
        this.orgFacet = orgFacet;
    }

    public Object getPerFacet() {
        return perFacet;
    }

    public void setPerFacet(Object perFacet) {
        this.perFacet = perFacet;
    }



    public List<Media> getMedia() {
        return media;
    }

    public void setMedia(List<Media> media) {
        this.media = media;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(url);
        dest.writeValue(adxKeywords);
        dest.writeValue(column);
        dest.writeValue(section);
        dest.writeValue(byline);
        dest.writeValue(type);
        dest.writeValue(title);
        dest.writeValue(_abstract);
        dest.writeValue(publishedDate);
        dest.writeValue(source);
        dest.writeValue(id);
        dest.writeValue(assetId);
        dest.writeValue(views);
        dest.writeValue(desFacet);
        dest.writeValue(orgFacet);
        dest.writeValue(perFacet);
        dest.writeValue(geoFacet);
        dest.writeList(media);
    }

    public int describeContents() {
        return 0;
    }

}
