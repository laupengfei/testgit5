package com.example.administrator.testgit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = (ImageView) findViewById(R.id.iv);

        //我是刘鹏飞
        TranslateAnimation anim = new TranslateAnimation(0, 300, 0, 300);
//        animationSet = new AnimationSet(this,R.anim.animation1);
        anim.setInterpolator(new BounceInterpolator());
        anim.setDuration(2000);

        iv.setAnimation(anim);

    }
}
