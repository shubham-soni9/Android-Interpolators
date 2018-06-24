# Android-Interpolators
This is a simple project used to understand how interpolator affects the animations.



[Check Video Here](https://firebasestorage.googleapis.com/v0/b/englsih-with-pictures.appspot.com/o/Github%20Projects%2Finterpolators.mp4?alt=media&token=71eb338e-be7e-4633-8e08-c92fe7147cc9)

[Download Demo](https://github.com/shubhamsoni00000/Android-Interpolators/blob/master/app-debug.apk)


# Usage

An interpolator is a mathematical tool that takes original time instances as an input, performs operation based on its mathematical equation and provides output as a time instance of a replacement frame for that given input instance.


#### AccelerateDecelerateInterpolator
An interpolator where the rate of change starts and ends slowly but accelerates through the middle.


#### AccelerateInterpolator
An interpolator where the rate of change starts out slowly and and then accelerates.


#### AnticipateInterpolator
An interpolator where the change starts backward then flings forward.


#### AnticipateOvershootInterpolator
An interpolator where the change starts backward then flings forward and overshoots the target value and finally goes back to the final value.


#### BounceInterpolator
An interpolator where the change bounces at the end.


#### CycleInterpolator
Repeats the animation for a specified number of cycles. The rate of change follows a sinusoidal pattern.


#### DecelerateInterpolator
An interpolator where the rate of change starts out quickly and and then decelerates.


#### LinearInterpolator
An interpolator where the rate of change is constant


#### OvershootInterpolator
An interpolator where the change flings forward and overshoots the last value then comes back.


#### PathInterpolator
An interpolator that can traverse a Path that extends from Point (0, 0) to (1, 1). The x coordinate along the Path is the input value and the output is the y coordinate of the line at that point. This means that the Path must conform to a function y = f(x).

#### LinearOutSlowInInterpolator
Interpolator corresponding to <b>linear_out_slow_in</b>. Uses a lookup table for the Bezier curve from (0,0) to (1,1) with control points: P0 (0, 0) P1 (0, 0) P2 (0.2, 1.0) P3 (1.0, 1.0)

#### FastOutLinearInInterpolator
Interpolator corresponding to <b>fast_out_linear_in</b>. Uses a lookup table for the Bezier curve from (0,0) to (1,1) with control points: P0 (0, 0) P1 (0.4, 0) P2 (1.0, 1.0) P3 (1.0, 1.0)


#### FastOutSlowInInterpolator
Interpolator corresponding to <b>fast_out_slow_in</b>. Uses a lookup table for the Bezier curve from (0,0) to (1,1) with control points: P0 (0, 0) P1 (0.4, 0) P2 (0.2, 1.0) P3 (1.0, 1.0)




