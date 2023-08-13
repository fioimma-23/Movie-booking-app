package com.example.moviebookingapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);


        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this, Dashboard.class);
                startActivity(intent);
            }
        });
    }
}