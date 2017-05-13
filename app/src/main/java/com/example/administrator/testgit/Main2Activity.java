package com.example.administrator.testgit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    RecyclerView rv;

    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();

        rv = (RecyclerView) findViewById(R.id.rv);

        rv.setLayoutManager(new LinearLayoutManager(this));

        ImageAdapter imageAdapter = new ImageAdapter(this);

        rv.setAdapter(imageAdapter);

        imageAdapter.setData(list);

    }

    private void init() {

        list = new ArrayList<>();

        list.add("");

    }
}
