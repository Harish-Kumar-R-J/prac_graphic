package com.example.sample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class SampleCanvas extends View {
    Paint paint = new Paint();
    public SampleCanvas(Context context) {
        super(context);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(0);
        canvas.drawRect(100, 100, 300, 300, paint);
        paint.setColor(Color.GREEN);
        canvas.drawCircle(200, 200, 75, paint);
        paint.setColor(Color.BLACK);
        canvas.drawLine(100, 200, 300, 200, paint);
        //we set this color by editing the color.xml file inside values directory
        canvas.drawText("Graphical Primitive",50,50,paint);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(3);
        canvas.drawPoint(200,200,paint);
    }
}
