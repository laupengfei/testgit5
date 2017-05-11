package com.example.administrator.testshengwan;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/5/10.
 */
public class FaBuPopWindow {

    private PopupWindow popupWindow;

    private Context context;

    private LinearLayout zhaopian;

    private LinearLayout shipin;

    private LinearLayout danpin;

    public FaBuPopWindow(Context context) {

        this.context = context;

    }

    public void showPopWindow(){
        // 一个自定义的布局，作为显示的内容
        View popView = LayoutInflater.from(context).inflate(
                R.layout.pop_window_fabu, null);

        popupWindow = new PopupWindow(popView,
                RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT, true);

        //int height =  ((Activity)context).getWindowManager().getDefaultDisplay().getHeight();

        int wigth =  ((Activity)context).getWindowManager().getDefaultDisplay().getWidth();
        popupWindow.setWidth(wigth);

        //设置点击外面让其消失
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        //初始化控件
        initPopView(popView);

        //显示PopupWindow
        View rootview = LayoutInflater.from(context).inflate(R.layout.fragment_shouye, null);

        popupWindow.showAtLocation(((Activity) context).getWindow().getDecorView(), Gravity.CENTER,0,400);

        // 设置背景颜色变暗
        bgBianAn();

        //设置pop消失时背景变亮
        bgBianLiang();




    }

    private void initPopView(View popView) {

        zhaopian= (LinearLayout) popView.findViewById(R.id.zhaopian);

        shipin= (LinearLayout) popView.findViewById(R.id.shipin);

        danpin = (LinearLayout)popView.findViewById( R.id.danpin );

        zhaopian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"照片",Toast.LENGTH_SHORT).show();
            }
        });

        shipin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"视频",Toast.LENGTH_SHORT).show();
            }
        });

        danpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"单品",Toast.LENGTH_SHORT).show();
            }
        });

    }


    private void bgBianLiang() {
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {

            @Override
            public void onDismiss() {
                WindowManager.LayoutParams lp = ((Activity)context).getWindow().getAttributes();
                lp.alpha = 1f;
                ((Activity)context).getWindow().setAttributes(lp);
            }
        });
    }

    private void bgBianAn() {

        WindowManager.LayoutParams lp =((Activity)context).getWindow().getAttributes();
        lp.alpha = 0.1f;
        ((Activity)context).getWindow().setAttributes(lp);

    }

}
