package com.example.socialmediagamer.models;

public class SliderItem {

    String ImageUrl;
    long timestamp;

    public SliderItem(){

    }

    public SliderItem(String imageUrl, long timestamp) {
        ImageUrl = imageUrl;
        this.timestamp = timestamp;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
