package com.example.newsapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IconBetterIdeaClient
{
    private static Retrofit retrofit = null;
    public static IconBetterIdeaServices getclient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://i.olsh.me/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        IconBetterIdeaServices iconBetterIdeaServices = retrofit.create(IconBetterIdeaServices.class);
        return iconBetterIdeaServices;
    }
}
