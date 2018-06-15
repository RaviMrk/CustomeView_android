package com.example.ravi.views.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {

    private static int SIZE=200;

    private Rect mrect;
    private Paint mpaint;

    public CustomView(Context context) {
        super(context);
        init(null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

     private void init(@Nullable AttributeSet set){

        mrect=new Rect();
        mpaint=new Paint(Paint.ANTI_ALIAS_FLAG);
         mpaint.setColor(Color.GREEN);
     }

     public void swapColor(){

        mpaint.setColor(mpaint.getColor() == Color.GREEN ? Color.RED :Color.GREEN);

        postInvalidate();
     }

    @Override
    protected void onDraw(Canvas canvas) {


        mrect.left=50;
        mrect.top=50;
        mrect.right=mrect.left + SIZE;
        mrect.bottom=mrect.top + SIZE;



        canvas.drawRect(mrect,mpaint);
    }
}
