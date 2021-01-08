package com.example.newsapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class HeadlineAdapter extends RecyclerView.Adapter<HeadlineAdapter.HeadlineViewHolder>
{
    Context context;
    List<articles>articlesList2 = new ArrayList<>();

    public HeadlineAdapter(Context context, List<articles> articlesList2) {
        this.context = context;
        this.articlesList2 = articlesList2;
    }

    @NonNull
    @Override
    public HeadlineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.headlines_list,parent,false);
        return new HeadlineViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeadlineViewHolder holder, int position)
    {
        //Intent intent = Intent.getIntent();
        int data = holder.getAdapterPosition();
        Glide.with(context)
                .load(articlesList2.get(position).getUrlTOImage())
                .into(holder.circleImageView);
        holder.headlines.setText(articlesList2.get(position).getTitle());
        //holder.authorName.setText(articlesList2.get(0).getAuthor());

        holder.headlines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,NewsListActivity.class);
                intent.putExtra("url",articlesList2.get(position).getUrl());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount()
    {
        return articlesList2.size();
    }

    public class HeadlineViewHolder extends RecyclerView.ViewHolder
    {
        CircleImageView circleImageView;
        TextView headlines;
        public HeadlineViewHolder(@NonNull View itemView)
        {
            super(itemView);
            circleImageView = (CircleImageView)itemView.findViewById(R.id.headlineImage);
            headlines  = (TextView)itemView.findViewById(R.id.headline);
        }
    }

}
