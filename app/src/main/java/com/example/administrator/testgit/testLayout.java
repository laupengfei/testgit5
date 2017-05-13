package com.example.administrator.testgit;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017/5/12.
 */
public class testLayout extends ViewGroup {

    private int height;

    private int wight;

    private int cheight;

    private int cwight;

    private int zuobiaoW;

    private int zuobiaoH;





    public testLayout(Context context) {
        this(context,null);
    }

    public testLayout(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public testLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    View childAt;
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec,heightMeasureSpec);

        height = getMeasuredHeight();

        wight = getMeasuredWidth();

        childAt = getChildAt(0);

        measureChild(childAt,widthMeasureSpec,heightMeasureSpec);

        cheight = childAt.getMeasuredHeight();

        cwight = childAt.getMeasuredWidth();

        Log.e("TAG", "cheight" + cheight + "cwight" + cwight);

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

//        childAt.layout(zuobiaoW,zuobiaoH,zuobiaoW+cwight,zuobiaoH+cwight);
        childAt.layout(wight/2-cwight/2,height,wight/2+cwight/2,height+cheight);
        if(isScroll) {
            Log.e("TAG","--------");
            childAt.scrollTo(0,0);
        }

    }

    boolean isScroll = false;

    public void setScroll(){

        isScroll = true;

        requestLayout();

    }



}

