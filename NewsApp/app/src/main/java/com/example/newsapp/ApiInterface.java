package com.example.newsapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface
{
    @GET("v2/top-headlines?country=us&apiKey=3fee466949f048e8a5cf2e04fc8c08d9")
    Call<GsonInformation>getGsonInformation();
}