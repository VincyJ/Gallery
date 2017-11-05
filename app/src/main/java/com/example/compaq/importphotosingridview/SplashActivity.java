package com.example.compaq.importphotosingridview;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        callNextScreen();
    }

    private void callNextScreen() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent nextScreen = new Intent(SplashActivity.this, Gallery.class);
                startActivity(nextScreen);
            }
        }, 2000);
    }
}
