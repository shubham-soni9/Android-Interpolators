package com.defaultinterpolators;

import android.app.Activity;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
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
import android.widget.ImageView;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private ImageView ivTestObject;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivTestObject = findViewById(R.id.ivTestObject);
    }

    private void startAnimation(Interpolator interpolator) {
        AnimationUtil.startAnimation(ivTestObject, interpolator);
    }

    public void onBtnClick(View view) {
        switch (view.getId()) {
            case R.id.acceleratedecelerate:
                startAnimation(new AccelerateDecelerateInterpolator());
                break;
            case R.id.accelerate:
                startAnimation(new AccelerateInterpolator());
                break;
            case R.id.decelerate:
                startAnimation(new DecelerateInterpolator());
                break;
            case R.id.anticipate:
                startAnimation(new AnticipateInterpolator());
                break;
            case R.id.anticipateovershoot:
                startAnimation(new AnticipateOvershootInterpolator());
                break;
            case R.id.bounce:
                startAnimation(new BounceInterpolator());
                break;
            case R.id.cycle:
                startAnimation(new CycleInterpolator(1));
                break;
            case R.id.overshoot:
                startAnimation(new OvershootInterpolator());
                break;
            case R.id.path:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    Path path = new Path();
                    path.lineTo(0f, 0.25f);
                    path.moveTo(0f, 0.5f);
                    path.lineTo(1f, 1f);
                    startAnimation(new PathInterpolator(path));
                }
                break;
            case R.id.linear:
                startAnimation(new LinearInterpolator());
                break;
            case R.id.linearOutSlowIn:
                startAnimation(new LinearOutSlowInInterpolator());
                break;
            case R.id.fastOutLinearIn:
                startAnimation(new FastOutLinearInInterpolator());
                break;
            case R.id.fastOutSlowIn:
                startAnimation(new FastOutSlowInInterpolator());
                break;

        }

    }
}