package com.example.newsapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class IconBetterIdea
{
        @SerializedName("url")
        private String url;
        @SerializedName("icons")
        private List<Icon> icons;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public List<Icon> getIcons() {
            return icons;
        }

        public void setIcons(List<Icon> icons) {
            this.icons = icons;
        }
}
