package com.ipn.mauriciodinki.tablonandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class TablonActivity extends ActionBarActivity {

    Paint paint = new Paint();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new ExampleView(this));
    }

    public class ExampleView extends View {
        public ExampleView (Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            canvas.drawRGB(255,255,255);
            int width = canvas.getWidth();
            int height = canvas.getHeight();

            paint.setARGB(255,0,0,0);
            paint.setStrokeWidth(5);
            paint.setStyle(Style.STROKE);

            paint.setColor(Color.YELLOW);
            canvas.drawRect(100, 50, 320, 800, paint);

            paint.setColor(Color.RED);
            RectF oval1 = new RectF(204, 100, 304, 170);
            canvas.drawOval(oval1, paint);

            paint.setColor(Color.RED);
            RectF oval2 = new RectF(120, 70, 190, 220);
            canvas.drawOval(oval2, paint);

            paint.setColor(Color.CYAN);
            RectF rectF = new RectF(100, 250, 500, 300);
            canvas.drawArc (rectF, 90, 45, false, paint);
        }
    }
}
