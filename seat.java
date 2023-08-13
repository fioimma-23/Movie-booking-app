package com.example.moviebookingapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class seat extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seat);


        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(seat.this, payment.class);
                startActivity(intent);
            }
        });
    }
}