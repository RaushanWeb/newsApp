package com.example.newsapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IconBetterIdeaServices
{
    @GET()
    Call<IconBetterIdea> getIconUrl(@Url String url);
}
