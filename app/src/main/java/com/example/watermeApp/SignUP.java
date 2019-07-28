package com.example.watermeApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        GetData();
    }
    void GetData()
    {
        Button Next = (Button)findViewById(R.id.Next);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Name = (TextView)findViewById(R.id.Name);
                TextView Email = (TextView)findViewById(R.id.Email);
                if(!Name.getText().toString().equals("")&&!Email.getText().toString().equals(""))
                {
                    Intent intent = new Intent(SignUP.this,FinishSignUP.class);
                    Bundle bund = new Bundle();
                    bund.putString("Name",Name.getText().toString());
                    bund.putString("Email",Email.getText().toString());
                    intent.putExtras(bund);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Inter your Data",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
