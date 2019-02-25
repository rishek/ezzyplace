package com.example.rishek.ezzyplace;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;

public class RegisterPage extends AppCompatActivity {

EditText name;
EditText password;
EditText email;
EditText country;
EditText pnumber;
ImageView facebook;
ImageView twitter;
ImageView googleplus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerpage);
        name=findViewById(R.id.registername);
        password=findViewById(R.id.registerpasswrd);
        email=findViewById(R.id.registermail);
        country=findViewById(R.id.registercountry);
        pnumber=findViewById(R.id.registernumber);
        facebook=findViewById(R.id.facebook);
        twitter=findViewById(R.id.tweet);
        googleplus=findViewById(R.id.gplus);

    }
}
