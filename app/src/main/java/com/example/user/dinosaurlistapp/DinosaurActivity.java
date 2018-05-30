package com.example.user.dinosaurlistapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DinosaurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinosaur);

        Intent intent = getIntent();
        Dinosaur dinosaur = (Dinosaur)intent.getSerializableExtra("dinosaur");
    }
}
