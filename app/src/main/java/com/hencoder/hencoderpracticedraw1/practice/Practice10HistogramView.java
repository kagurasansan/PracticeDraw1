package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

public class Practice10HistogramView extends View {

    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private final Random random;

    {
        random = new Random();
        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(2);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        mPaint.setColor(Color.WHITE);
        canvas.drawLine(150,100,150,600,mPaint);
        canvas.drawLine(150,600,1000,600,mPaint);
        int startX = 200;
        int padding = 120;
        mPaint.setColor(Color.GREEN);
        for(int i = 0;i < 7;i++){

            canvas.drawRect(startX,random.nextInt(450) + 150,startX + 100,600,mPaint);
            startX = startX + padding;
        }

    }
}
