package com.example.watermeApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class App_Intro extends AppCompatActivity {

    private static  ImageView view;
    private static  Button next;

    public int selectedImage=0;
     int [] list = {R.drawable.screen2 ,R.drawable.screen3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app__intro);

        view=(ImageView)findViewById(R.id.view);
        next=(Button)findViewById(R.id.next_B);

      next.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        setImage();
    }
});

    }
    void setImage()
    {
        if(selectedImage==2)
        {
            App_Intro.this.startActivity(new Intent(App_Intro.this ,SignUP.class));
        }
        else
        {
            view.setImageResource(list[selectedImage]);
            selectedImage++;
        }
    }
}
