package com.example.administrator.testshengwan;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Fragment> list;

    RelativeLayout shouye;

    RelativeLayout goumai;

    RelativeLayout guanzhu;

    RelativeLayout wode;

    ViewPager viewPager;

    ImageButton fabu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initFragment();

        initClick();

    }

    boolean isShow;
    private void initClick() {

        shouye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });

        goumai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });

        guanzhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });

        wode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });

        fabu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FaBuPopWindow  faBuPopWindow =new FaBuPopWindow(MainActivity.this);


                faBuPopWindow.showPopWindow();
            }
        });


    }

    private void initView() {

        shouye = (RelativeLayout) findViewById(R.id.rl_home);

        goumai = (RelativeLayout) findViewById(R.id.rl_goumai);

        guanzhu = (RelativeLayout) findViewById(R.id.rl_guanzhu);

        wode = (RelativeLayout) findViewById(R.id.rl_wode);

        viewPager = (ViewPager) findViewById(R.id.view_pager);

        fabu = (ImageButton) findViewById(R.id.ib_fabu);

    }

    private void initFragment() {

        list = new ArrayList<>();

        list.add(new ShouYeFragment());

        list.add(new ShouYeFragment());

        list.add(new ShouYeFragment());

        list.add(new ShouYeFragment());


        viewPager.setAdapter(new MainPagerAdapter(getSupportFragmentManager(), list));

        viewPager.setCurrentItem(0);

        viewPager.setOffscreenPageLimit(10);
    }


}
