package com.defaultinterpolators;

import android.view.View;

public class Utils {

    public static void setOnClickListener(View.OnClickListener onClickListener, View... views) {
        for (View view : views) {
            view.setOnClickListener(onClickListener);
        }
    }
}
