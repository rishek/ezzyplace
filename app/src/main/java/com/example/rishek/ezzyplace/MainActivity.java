package com.example.rishek.ezzyplace;

import  android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView register;
TextView forgotpassword;
EditText username;
EditText password;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Context context=this;
        setContentView(R.layout.loginpage);
        register=findViewById(R.id.rgstr);
        forgotpassword=findViewById(R.id.forgtpsswrd);
        password=findViewById(R.id.psswrd);
        username=findViewById(R.id.user);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, RegisterPage.class);
                startActivity(intent);
            }
        });
        }
}
