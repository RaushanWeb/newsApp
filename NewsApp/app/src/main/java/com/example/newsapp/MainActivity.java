package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDate;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
{
    RecyclerView recyclerView;
    static List<articles> articlesList1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        getUserListData();
    }
    public void getUserListData()
    {
        final ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Please Wait!");
        progressDialog.show();

        (Api.getClient().getGsonInformation()).enqueue(new Callback<GsonInformation>() {
            @Override
            public void onResponse(Call<GsonInformation> call, Response<GsonInformation> response)
            {
                progressDialog.dismiss();
                if(response.body().getStatus().equals("ok"))
                {
                    articlesList1 = response.body().getArticlesList();
                    if(articlesList1.size()>0)
                    {
                        //Toast.makeText(MainActivity.this,"ok",Toast.LENGTH_LONG).show();
                        setDataInREcyclerView(articlesList1);

                    }
                }
            }
            @Override
            public void onFailure(Call<GsonInformation> call, Throwable t)
            {
                Toast.makeText(MainActivity.this,t.toString(),Toast.LENGTH_LONG).show();
                progressDialog.dismiss();
            }
        });
    }
    public void setDataInREcyclerView(List<articles>list)
    {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        ListAdapter userAdapter = new ListAdapter(MainActivity.this,list);
        recyclerView.setAdapter(userAdapter);
    }
}