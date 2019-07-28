package com.example.watermeApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplachScreen extends AppCompatActivity {

    Handler handler =new Handler();
    Runnable runnable ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_screen);

        // start splach sceen
        creat_SplachScree();
    }
    @Override //Destroy the runnable class
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable);
    }

    void creat_SplachScree()
    {
        runnable = new Runnable() {
            @Override
            public void run() {
                SplachScreen.this.startActivity(new Intent(
                        SplachScreen.this , App_Intro.class));
                finish();
            }
        };
        handler.postDelayed(runnable ,4000);
    }
}
