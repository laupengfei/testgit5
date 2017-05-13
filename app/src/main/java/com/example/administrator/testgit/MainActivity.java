package com.example.administrator.testgit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.iv);

        //这是test1
        //我是刘鹏飞
        final TranslateAnimation anim = new TranslateAnimation(0, 300, 0, 300);
//        animationSet = new AnimationSet(this,R.anim.animation1);
        anim.setInterpolator(new OvershootInterpolator(3));
        anim.setDuration(300);

        anim.setFillAfter(true);
        //iv.setAnimation(anim);

        final testLayout testLayout = (com.example.administrator.testgit.testLayout) findViewById(R.id.test_layout);

        findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // testLayout.setScroll();
                iv.startAnimation(anim);
            }
        });

    }
}
