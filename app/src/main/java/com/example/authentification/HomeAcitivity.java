package com.example.authentification;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeAcitivity extends AppCompatActivity {
    Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_acitivity);
        Login = (Button)findViewById(R.id.goLogin);
        Login.setOnClickListener((new View.OnClickListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onClick(View view) {


                Intent i = new Intent(HomeAcitivity.this, MainActivity.class);
                startActivity(i);
            }})
        );
    }
}