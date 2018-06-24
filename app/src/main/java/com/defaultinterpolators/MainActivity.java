package com.defaultinterpolators;

import android.app.Activity;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private ImageView          ivTestObject;
    private ArrayList<Integer> mButtonIdList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivTestObject = findViewById(R.id.ivTestObject);
        mButtonIdList = new ArrayList<>();
        mButtonIdList.add(R.id.acceleratedecelerate);
        mButtonIdList.add(R.id.accelerate);
        mButtonIdList.add(R.id.decelerate);
        mButtonIdList.add(R.id.anticipate);
        mButtonIdList.add(R.id.anticipateovershoot);
        mButtonIdList.add(R.id.bounce);
        mButtonIdList.add(R.id.cycle);
        mButtonIdList.add(R.id.overshoot);
        mButtonIdList.add(R.id.path);
        mButtonIdList.add(R.id.linear);
        mButtonIdList.add(R.id.linearOutSlowIn);
        mButtonIdList.add(R.id.fastOutLinearIn);
        mButtonIdList.add(R.id.fastOutSlowIn);
        resetButtonUI();
    }

    private void startAnimation(View view, Interpolator interpolator) {
        AnimationUtil.startAnimation(ivTestObject, interpolator);
        resetButtonUI();
        if (view instanceof Button) {
            view.setBackgroundResource(R.color.black);
            ((Button) view).setTextColor(ContextCompat.getColor(this, R.color.white));
        }
    }

    public void onBtnClick(View view) {
        switch (view.getId()) {
            case R.id.acceleratedecelerate:
                startAnimation(view, new AccelerateDecelerateInterpolator());
                break;
            case R.id.accelerate:
                startAnimation(view, new AccelerateInterpolator());
                break;
            case R.id.decelerate:
                startAnimation(view, new DecelerateInterpolator());
                break;
            case R.id.anticipate:
                startAnimation(view, new AnticipateInterpolator());
                break;
            case R.id.anticipateovershoot:
                startAnimation(view, new AnticipateOvershootInterpolator());
                break;
            case R.id.bounce:
                startAnimation(view, new BounceInterpolator());
                break;
            case R.id.cycle:
                startAnimation(view, new CycleInterpolator(1));
                break;
            case R.id.overshoot:
                startAnimation(view, new OvershootInterpolator());
                break;
            case R.id.path:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    Path path = new Path();
                    path.lineTo(0f, 0.25f);
                    path.moveTo(0f, 0.5f);
                    path.lineTo(1f, 1f);
                    startAnimation(view, new PathInterpolator(path));
                }
                break;
            case R.id.linear:
                startAnimation(view, new LinearInterpolator());
                break;
            case R.id.linearOutSlowIn:
                startAnimation(view, new LinearOutSlowInInterpolator());
                break;
            case R.id.fastOutLinearIn:
                startAnimation(view, new FastOutLinearInInterpolator());
                break;
            case R.id.fastOutSlowIn:
                startAnimation(view, new FastOutSlowInInterpolator());
                break;

        }
    }

    private void resetButtonUI() {
        for (Integer buttonId : mButtonIdList) {
            setBackground(findViewById(buttonId));
        }
    }


    private void setBackground(View view) {
        if (view instanceof Button) {
            view.setBackgroundResource(R.color.white);
            ((Button) view).setTextColor(ContextCompat.getColor(this, R.color.black));
        }
    }

}