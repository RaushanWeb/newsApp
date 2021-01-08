package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import static com.example.newsapp.MainActivity.articlesList1;

import java.util.ArrayList;

public class HeadlinesActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_headlines);
        if(articlesList1.size()>0)
        {
            RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerviewHeadlines);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(new HeadlineAdapter(HeadlinesActivity.this,articlesList1));
        }


    }
}