
package com.geora.model.myactivity;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetDefaultImage_ implements Parcelable {

    @SerializedName("image_id")
    @Expose
    private Integer imageId;
    @SerializedName("camp_id")
    @Expose
    private Integer campId;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getCampId() {
        return campId;
    }

    public void setCampId(Integer campId) {
        this.campId = campId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.imageId);
        dest.writeValue(this.campId);
        dest.writeString(this.imageUrl);
    }

    public GetDefaultImage_() {
    }

    protected GetDefaultImage_(Parcel in) {
        this.imageId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.campId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.imageUrl = in.readString();
    }

    public static final Parcelable.Creator<GetDefaultImage_> CREATOR = new Parcelable.Creator<GetDefaultImage_>() {
        @Override
        public GetDefaultImage_ createFromParcel(Parcel source) {
            return new GetDefaultImage_(source);
        }

        @Override
        public GetDefaultImage_[] newArray(int size) {
            return new GetDefaultImage_[size];
        }
    };
}
