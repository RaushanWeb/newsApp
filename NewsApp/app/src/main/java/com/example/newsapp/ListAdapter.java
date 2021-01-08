package com.example.newsapp;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder>
{
    private Context context;
    List<articles> gsonList;
    public ListAdapter(Context context, List<articles> gsonList) {
        this.context = context;
        this.gsonList = gsonList;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recyclerview_list,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position)
    {
        holder.textView.setText(gsonList.get(position).getSourceList().getName());


        StringBuilder builder = new StringBuilder("allicons.json?url=");
        builder.append(gsonList.get(position).getUrl());

        (IconBetterIdeaClient.getclient().getIconUrl(builder.toString())).enqueue(new Callback<IconBetterIdea>() {
            @Override
            public void onResponse(Call<IconBetterIdea> call, Response<IconBetterIdea> response)
            {
                try
                {
                    if(response.body().getIcons().size()>0)
                    {
                        Glide.with(context)
                                .load(response.body().getIcons().get(0).getIconUrl())
                                .into(holder.imageView);
                    }

                }
                catch (Exception e) { }
            }

            @Override
            public void onFailure(Call<IconBetterIdea> call, Throwable t)
            {
                Toast.makeText(context,t.toString(),Toast.LENGTH_LONG).show();

            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(context,gsonList.get(position).getSourceList().getName(),Toast.LENGTH_LONG).show();
                Log.e("name",gsonList.get(position).getSourceList().getName());
                Intent intent = new Intent(context,HeadlinesActivity.class);
                context.startActivity(intent);


            }
        });
    }

    @Override
    public int getItemCount()
    {
        return gsonList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView;
        CircleImageView imageView ;
        public ListViewHolder(@NonNull View itemView)
        {
            super(itemView);
            textView = (TextView)itemView.findViewById(R.id.name);
            imageView = (CircleImageView)itemView.findViewById(R.id.imageIcon1);
        }
    }
}
