package com.example.watermeApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FinishSignUP extends AppCompatActivity {

    String name;
    String email;
    String age;
    String hieght;
    String wieght;
    String amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_sign_up);

        Bundle Bund = getIntent().getExtras();

        name = Bund.getString("Name");
        email= Bund.getString("Email");

        SetName(name);

        Button SignUP = (Button)findViewById(R.id.SignUP);

        SignUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getdata();

            }
        });


    }
    void SetName(String name)
    {
        TextView Name =(TextView)findViewById(R.id.UserName);
        Name.setText("Welcom"+name);
    }
    void getdata()
    {
        TextView Age = (TextView)findViewById(R.id.Age);
        TextView Hieght = (TextView)findViewById(R.id.Height);
        TextView Wieght = (TextView)findViewById(R.id.Weight);
        TextView AmountofWater = (TextView)findViewById(R.id.Amount);
        if(!Age.getText().toString().equals("")&&!Hieght.getText().toString().equals("")&&!Wieght.getText().toString().equals("")&&!AmountofWater.getText().toString().equals(""))
        {
            age = Age.getText().toString();
            hieght = Hieght.getText().toString();
            wieght = Wieght.getText().toString();
            amount = AmountofWater.getText().toString();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Inter your Data",Toast.LENGTH_LONG).show();
        }

    }
}
