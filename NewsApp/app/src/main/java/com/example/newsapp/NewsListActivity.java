package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class NewsListActivity extends AppCompatActivity
{
   // TextView title,authorName,description;
    //ImageView imageToUrl;
    WebView url;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_list);

        //title = (TextView)findViewById(R.id.titleNews);
        //authorName = (TextView)findViewById(R.id.authorname);
        //description = (TextView)findViewById(R.id.description);
        //imageToUrl  = (ImageView)findViewById(R.id.imageToUrl);
        url = (WebView) findViewById(R.id.url);

        Intent intent = getIntent();
       // Toast.makeText(getApplicationContext(),intent.getStringExtra("name"),Toast.LENGTH_LONG);
       // title.setText(intent.getStringExtra("title"));
        //authorName.setText("author:-"+intent.getStringExtra("author"));
        //description.setText(intent.getStringExtra("description"));

        /*Glide.with(NewsListActivity.this)
                .load(intent.getStringExtra("urlToImage"))
                .into(imageToUrl);*/


        url.getSettings().setJavaScriptEnabled(true);
        url.setWebChromeClient(new WebChromeClient());
        url.setWebViewClient(new WebViewClient());
        url.loadUrl(intent.getStringExtra("url"));

    }
}