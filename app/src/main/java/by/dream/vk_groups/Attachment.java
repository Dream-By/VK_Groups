
package by.dream.vk_groups;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attachment {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("audio")
    @Expose
    private Audio audio;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

}
