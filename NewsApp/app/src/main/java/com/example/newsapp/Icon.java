package com.example.newsapp;

import com.google.gson.annotations.SerializedName;

public class Icon
{
    @SerializedName("url")
    private String url;
    @SerializedName("width")
    private int width;
    @SerializedName("height")
     private int height;
    @SerializedName("bytes")
     private int bytes;
    @SerializedName("format")
    private String format;
    @SerializedName("shalsum")
    private  String shalsum;
    @SerializedName("error")
    private Object error;

    public String getIconUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getShalsum() {
        return shalsum;
    }

    public void setShalsum(String shalsum) {
        this.shalsum = shalsum;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }
}
