
package com.geora.model.myactivity;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetImage__ implements Parcelable {

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

    public GetImage__() {
    }

    protected GetImage__(Parcel in) {
        this.imageId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.campId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.imageUrl = in.readString();
    }

    public static final Parcelable.Creator<GetImage__> CREATOR = new Parcelable.Creator<GetImage__>() {
        @Override
        public GetImage__ createFromParcel(Parcel source) {
            return new GetImage__(source);
        }

        @Override
        public GetImage__[] newArray(int size) {
            return new GetImage__[size];
        }
    };
}
