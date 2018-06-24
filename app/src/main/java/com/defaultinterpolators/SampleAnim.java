package com.defaultinterpolators;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;

public class SampleAnim {

    public static void startAnimation(View view, Interpolator interpolator) {
        ViewGroup parent = (ViewGroup) view.getParent();
        ObjectAnimator animation = ObjectAnimator.ofFloat(view, "translationY", -parent.getHeight(), 0f);
        animation.setInterpolator(interpolator);
        animation.setDuration(2000);
        animation.start();
    }
}
