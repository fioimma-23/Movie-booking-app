package com.example.moviebookingapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);


        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Booking.java.class);
                startActivity(intent);
            }
        });
    }
}