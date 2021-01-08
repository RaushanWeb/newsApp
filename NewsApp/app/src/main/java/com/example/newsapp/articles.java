package com.example.newsapp;

import com.google.gson.annotations.SerializedName;

public class articles
{
    @SerializedName("source")
    private source sourceList;
    @SerializedName("author")
    private String author;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("url")
    private String url;
    @SerializedName("urlToImage")
    private String urlTOImage;
    @SerializedName("publishedAt")
    private String publishedAt;
    @SerializedName("content")
    private String content;

    /*public articles(source sourceList, String author, String title, String description, String url, String urlTOImage, String publishedAt, String content) {
        this.sourceList = sourceList;
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlTOImage = urlTOImage;
        this.publishedAt = publishedAt;
        this.content = content;
    }*/

    public source getSourceList() {
        return sourceList;
    }

    public void setSourceList(source sourceList) {
        this.sourceList = sourceList;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlTOImage() {
        return urlTOImage;
    }

    public void setUrlTOImage(String urlTOImage) {
        this.urlTOImage = urlTOImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
