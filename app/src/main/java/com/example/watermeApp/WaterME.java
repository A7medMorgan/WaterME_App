package com.example.watermeApp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WaterME extends AppCompatActivity {

    //Fragment Home;
    //Fragment History;
    public Fragment Master;
    Button home_B ;
    Button history_B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_me);

        home_B = (Button)findViewById(R.id.Home);
        history_B = (Button)findViewById(R.id.History);

        home_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // translateTOhome();
                translateTOhistory();
            }
        });
        history_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  translateTOhistory();
                translateTOhome();
            }
        });


    }
    void translateTOhome()
    {
        //Home = new Home();
        Master = new Home();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.Fragment ,Master);
        ft.commit();

    }
    void translateTOhistory()
    {
        //History  =new History();
        Master = new History();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.Fragment ,Master);
        ft.commit();
    }
}
