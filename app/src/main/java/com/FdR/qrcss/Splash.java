package com.FdR.qrcss;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.FdR.qrcss.HOME.Home;

public class Splash extends AppCompatActivity {

    /** Time of wait **/
    private final int SPLASH_Time = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, Home.class);
                Splash.this.startActivity(intent);
                Splash.this.finish();
            }
        },SPLASH_Time);

    }
}