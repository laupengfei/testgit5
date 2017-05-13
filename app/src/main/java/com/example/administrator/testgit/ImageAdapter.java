package com.example.administrator.testgit;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
public class ImageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<String> list;

    private Context mContext;

    public ImageAdapter (Context context){

        mContext = context;

        list = new ArrayList<>();

    }

    public void setData(ArrayList<String> list1){

        list.clear();

        list.addAll(list1);

        notifyDataSetChanged();

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.item_image,null,false);
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    class ImageViewHolder extends RecyclerView.ViewHolder{

        ImageView iv;

        public ImageViewHolder(View itemView) {
            super(itemView);

            iv = (ImageView) itemView.findViewById(R.id.iv);

        }

        public void proceData(String url){

            Glide.with(mContext).load(url).into(iv);

        }

    }

}
