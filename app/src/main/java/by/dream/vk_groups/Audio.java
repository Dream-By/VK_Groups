
package by.dream.vk_groups;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Audio {

    @SerializedName("artist")
    @Expose
    private String artist;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("owner_id")
    @Expose
    private Integer ownerId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("date")
    @Expose
    private Integer date;
    @SerializedName("genre_id")
    @Expose
    private Integer genreId;
    @SerializedName("no_search")
    @Expose
    private Integer noSearch;
    @SerializedName("content_restricted")
    @Expose
    private Integer contentRestricted;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public Integer getNoSearch() {
        return noSearch;
    }

    public void setNoSearch(Integer noSearch) {
        this.noSearch = noSearch;
    }

    public Integer getContentRestricted() {
        return contentRestricted;
    }

    public void setContentRestricted(Integer contentRestricted) {
        this.contentRestricted = contentRestricted;
    }

}
