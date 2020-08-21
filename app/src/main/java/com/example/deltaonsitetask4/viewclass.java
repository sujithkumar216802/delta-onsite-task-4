package com.example.deltaonsitetask4;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;

import java.util.ArrayList;
import java.util.Objects;

public class viewclass extends View {

    static viewmodel rep;
    static Paint stroke;
    //static Float prevx, prevy;
    //static Observer<Path> path;

    public viewclass(Context context) {
        super(context);
        rep = new ViewModelProvider((ViewModelStoreOwner) context).get(viewmodel.class);
        stroke = new Paint();
        stroke.setColor(Color.BLACK);
        stroke.setAntiAlias(true);
        stroke.setStyle(Paint.Style.STROKE);
        stroke.setStrokeJoin(Paint.Join.ROUND);
        stroke.setStrokeWidth(getpx(3));



    }

    public viewclass(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public viewclass(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public viewclass(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @SuppressLint("DrawAllocation")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        /*if (rep.getPath().getValue() == null)
            rep.getPath().setValue(new Path());*/



        /*rep.getPath().getValue().moveTo(100,100);

        rep.getPath().getValue().lineTo(1000,1000);*/

        canvas.drawPath(Objects.requireNonNull(rep.getPath().getValue()), stroke);

        //canvas.drawLine(100,100,,200,stroke);

        // canvas.draw

        /*for(int i = 0; i< Objects.requireNonNull(rep.getX().getValue()).size()-1; i++){
            canvas.drawLine(rep.getX().getValue().get(i),rep.getY().getValue().get(i),rep.getX().getValue().get(i+1),rep.getY().getValue().get(i+1),stroke);

        }*/


    }


    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {

                Path temp = new Path(rep.getPath().getValue());
                temp.moveTo(event.getX(), event.getY());

                rep.getPath().setValue(temp);
                //Objects.requireNonNull(rep.getPath().getValue()).moveTo(event.getX(), event.getY());
                //    postInvalidate();
                return true;
            }
            case MotionEvent.ACTION_MOVE: {

                Path temp = new Path(rep.getPath().getValue());
                temp.lineTo(event.getX(), event.getY());

                rep.getPath().setValue(temp);

                //Objects.requireNonNull(rep.getPath().getValue()).lineTo(event.getX(), event.getY());


                /*if (prevx == null || prevy == null) {
                    prevx = event.getX();
                    prevy = event.getY();
                }*/


                //Objects.requireNonNull(rep.getPath().getValue()).addRect(prevx, prevy, event.getX(), event.getY(), Path.Direction.CW);



               /* prevx = event.getX();
                prevy = event.getY();*/

                /*if (rep.getMoveto()) {
                    Objects.requireNonNull(rep.getPath().getValue()).moveTo(event.getX(), event.getY());
                    //rep.setMoveto(false);
                } else {
                    Objects.requireNonNull(rep.getPath().getValue()).lineTo(event.getX(), event.getY());

                }*/

                //rep.setMoveto(!rep.getMoveto());
                //Objects.requireNonNull(rep.getPath().getValue()).moveTo(event.getX(), event.getY());
                //rep.getPath().getValue().addCircle(event.getX(),event.getY(),7,Path.Direction.CW);

                //Objects.requireNonNull(rep.getPath().getValue()).moveTo(event.getX(),event.getY());

                /*rep.getPath().getValue().add*/


                /*ArrayList<Float> x = new ArrayList<>(Objects.requireNonNull(rep.getX().getValue()));
                x.add(event.getX());

                ArrayList<Float> y = new ArrayList<>(Objects.requireNonNull(rep.getY().getValue()));
                y.add(event.getY());

                rep.getX().setValue(x);
                rep.getY().setValue(y);
*/


                // postInvalidate();
                //return true;
                break;

            }//   rep.getPath().getValue().lineTo(event.getX(),event.getY());
            default:
                return false;

        }

        postInvalidate();
        return super.onTouchEvent(event);
    }


    public float getpx(int dp) {
        return ((float) getResources().getDisplayMetrics().densityDpi / 160) * dp;
    }


}
