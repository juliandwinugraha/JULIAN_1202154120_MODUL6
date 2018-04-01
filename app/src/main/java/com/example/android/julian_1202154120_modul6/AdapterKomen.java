package com.example.android.julian_1202154120_modul6;

/**
 * Created by Julian on 4/1/2018.
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdapterKomen extends RecyclerView.Adapter<AdapterKomen.ViewHolder> {

    Context context;
    List<Comment> commentList;
    RoundedBitmapDrawable rounded;

    public AdapterKomen(Context context, ArrayList<Comment> commentList) {
        this.context = context;
        this.commentList = commentList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mUsername;
        TextView mComment;
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img_avatar);
            mUsername=itemView.findViewById(R.id.tv_username);
            mComment=itemView.findViewById(R.id.tv_comment);
        }
    }

    @NonNull
    @Override
    public AdapterKomen.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.komen_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Comment comment= commentList.get(position);

        holder.mUsername.setText(comment.getUsername());
        holder.mComment.setText(comment.getComment());
//        setupImageRounded();
        holder.imageView.setImageResource(R.drawable.ic_account_circle_black_24dp);

    }

    @Override
    public int getItemCount() {
        return commentList.size();
    }



}
