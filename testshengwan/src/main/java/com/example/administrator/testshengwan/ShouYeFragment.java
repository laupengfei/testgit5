package com.example.administrator.testshengwan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/10.
 */
public class ShouYeFragment extends Fragment {

    RecyclerView rv;

    List<String> list ;

    ShouYeAdapter adapter;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_shouye, container, false);

        rv = (RecyclerView) inflate.findViewById(R.id.rv_shouye);


        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        rv.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter = new ShouYeAdapter(getActivity());

        rv.setAdapter(adapter);

        initData();
    }

    private void initData() {
        list = new ArrayList<>();

        for (int i=0;i<20;i++){
            list.add("");
        }

        adapter.setData(list);


    }
}
