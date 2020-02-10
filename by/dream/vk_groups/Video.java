
package by.dream.vk_groups;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("access_key")
    @Expose
    private String accessKey;
    @SerializedName("can_comment")
    @Expose
    private Integer canComment;
    @SerializedName("can_edit")
    @Expose
    private Integer canEdit;
    @SerializedName("can_like")
    @Expose
    private Integer canLike;
    @SerializedName("can_repost")
    @Expose
    private Integer canRepost;
    @SerializedName("can_subscribe")
    @Expose
    private Integer canSubscribe;
    @SerializedName("can_add_to_faves")
    @Expose
    private Integer canAddToFaves;
    @SerializedName("can_add")
    @Expose
    private Integer canAdd;
    @SerializedName("can_attach_link")
    @Expose
    private Integer canAttachLink;
    @SerializedName("comments")
    @Expose
    private Integer comments;
    @SerializedName("date")
    @Expose
    private Integer date;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("photo_130")
    @Expose
    private String photo130;
    @SerializedName("photo_320")
    @Expose
    private String photo320;
    @SerializedName("photo_640")
    @Expose
    private String photo640;
    @SerializedName("photo_800")
    @Expose
    private String photo800;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("owner_id")
    @Expose
    private Integer ownerId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("track_code")
    @Expose
    private String trackCode;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("local_views")
    @Expose
    private Integer localViews;
    @SerializedName("platform")
    @Expose
    private String platform;

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public Integer getCanComment() {
        return canComment;
    }

    public void setCanComment(Integer canComment) {
        this.canComment = canComment;
    }

    public Integer getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(Integer canEdit) {
        this.canEdit = canEdit;
    }

    public Integer getCanLike() {
        return canLike;
    }

    public void setCanLike(Integer canLike) {
        this.canLike = canLike;
    }

    public Integer getCanRepost() {
        return canRepost;
    }

    public void setCanRepost(Integer canRepost) {
        this.canRepost = canRepost;
    }

    public Integer getCanSubscribe() {
        return canSubscribe;
    }

    public void setCanSubscribe(Integer canSubscribe) {
        this.canSubscribe = canSubscribe;
    }

    public Integer getCanAddToFaves() {
        return canAddToFaves;
    }

    public void setCanAddToFaves(Integer canAddToFaves) {
        this.canAddToFaves = canAddToFaves;
    }

    public Integer getCanAdd() {
        return canAdd;
    }

    public void setCanAdd(Integer canAdd) {
        this.canAdd = canAdd;
    }

    public Integer getCanAttachLink() {
        return canAttachLink;
    }

    public void setCanAttachLink(Integer canAttachLink) {
        this.canAttachLink = canAttachLink;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getPhoto130() {
        return photo130;
    }

    public void setPhoto130(String photo130) {
        this.photo130 = photo130;
    }

    public String getPhoto320() {
        return photo320;
    }

    public void setPhoto320(String photo320) {
        this.photo320 = photo320;
    }

    public String getPhoto640() {
        return photo640;
    }

    public void setPhoto640(String photo640) {
        this.photo640 = photo640;
    }

    public String getPhoto800() {
        return photo800;
    }

    public void setPhoto800(String photo800) {
        this.photo800 = photo800;
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

    public String getTrackCode() {
        return trackCode;
    }

    public void setTrackCode(String trackCode) {
        this.trackCode = trackCode;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getLocalViews() {
        return localViews;
    }

    public void setLocalViews(Integer localViews) {
        this.localViews = localViews;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

}
