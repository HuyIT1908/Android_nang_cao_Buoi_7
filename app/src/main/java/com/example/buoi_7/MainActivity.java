package com.example.buoi_7;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imv_buoi7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imv_buoi7 = findViewById(R.id.imv_buoi7);

    }

    public void show_Property_Animation(View view) {
//        ObjectAnimator  animator = ObjectAnimator.ofFloat(imv_buoi7 ,
//                "alpha" , 0f , 1f);
        ObjectAnimator  animator = ObjectAnimator.ofFloat(imv_buoi7 ,
                "rotation" , 0f , 360f);
        animator.setDuration(10);
        animator.setRepeatCount(1000);
//        lap lai vo han
//        animator.setRepeatMode(ValueAnimator.INFINITE);
        animator.start();
    }

    public void show_View_Animation(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,
                R.anim.test);
        imv_buoi7.startAnimation(animation);
    }

    public void show_Drawable_Animation(View view) {
        imv_buoi7.setBackgroundResource(R.drawable.animation);
        AnimationDrawable animationDrawable =
                (AnimationDrawable) imv_buoi7.getBackground();
        animationDrawable.start();
    }

}