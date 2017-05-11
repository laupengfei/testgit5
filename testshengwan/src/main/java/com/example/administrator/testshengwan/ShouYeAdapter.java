package com.example.administrator.testshengwan;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/10.
 */
public class ShouYeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;

    private List<String> data;

    public ShouYeAdapter(Context context){

        mContext = context;

        data = new ArrayList<>();
    }

    public void setData(List<String> data) {
        this.data = data;
        notifyDataSetChanged();

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_shoye,parent,false);

        return new ShouYeVieHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ShouYeVieHolder extends  RecyclerView.ViewHolder{

        public ShouYeVieHolder(View itemView) {
            super(itemView);
        }


    }


}
