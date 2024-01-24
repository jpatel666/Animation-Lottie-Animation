package com.iw.animationlottieanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        //Animation
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_animation);
        textView.startAnimation(animation);

    }
}