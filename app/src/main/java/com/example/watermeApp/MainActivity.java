package com.example.watermeApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    Handler handler =new Handler();
    Runnable runnable ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                MainActivity.this.startActivity(new Intent(
                        MainActivity.this , App_Intro.class));
                finish();
            }
        };
        handler.postDelayed(runnable ,4000);
    }
}
