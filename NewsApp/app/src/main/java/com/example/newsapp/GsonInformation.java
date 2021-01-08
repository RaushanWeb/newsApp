package com.example.newsapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GsonInformation
{
    @SerializedName("status")
    private String status;
    @SerializedName("totalResults")
    private String totalResults;
    @SerializedName("articles")
    List<articles> articlesList = null;

    /*public GsonInformation(String status, String totalResults, List<articles> articlesList) {
        this.status = status;
        this.totalResults = totalResults;
        this.articlesList = articlesList;
    }*/

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public List<articles> getArticlesList() {
        return articlesList;
    }

    public void setArticlesList(List<articles> articlesList) {
        this.articlesList = articlesList;
    }
}