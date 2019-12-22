package com.example.jjis;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

        Handler handler;
        ImageView splash_logo;
        TextView splash_txt1, splash_txt2;

        @SuppressLint("WrongViewCast")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);
            handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SplashScreen.this, Dashboard.class);
                    startActivity(intent);
                    finish();
                }
            }, 3000);

            splash_logo = findViewById(R.id.splash_logo);
            splash_txt1 = findViewById(R.id.splash_txt1);
            splash_txt2 = findViewById(R.id.splash_txt2);

            Animation logo = AnimationUtils.loadAnimation(this, R.anim.splash);
            splash_logo.startAnimation(logo);
            splash_txt1.startAnimation(logo);
            splash_txt2.startAnimation(logo);
        }
}
