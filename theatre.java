package com.example.moviebookingapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class theatre extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.theatre);


        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(theatre.this, seat.class);
                startActivity(intent);
            }
        });
    }
}