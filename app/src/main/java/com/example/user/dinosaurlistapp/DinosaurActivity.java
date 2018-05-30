package com.example.user.dinosaurlistapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DinosaurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinosaur);

        Intent intent = getIntent();
        Dinosaur dinosaur = (Dinosaur)intent.getSerializableExtra("dinosaur");

        ImageView imageView = findViewById(R.id.imageView);
        int id = getResources().getIdentifier(dinosaur.getName().toLowerCase(), "drawable", getPackageName());
        imageView.setImageResource(id);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(dinosaur.getName());

        TextView length = (TextView) findViewById(R.id.length);
        length.setText(getString(R.string.length_of_dinosaur) + " " + dinosaur.getLength().toString() + " metres");

        TextView weight = (TextView) findViewById(R.id.weight);
        weight.setText(getString(R.string.weight_of_dinosaur) + " " + dinosaur.getWeight().toString() + " tonne(s)");

        Log.d("Dinosaur Activity: ", dinosaur.getName());
    }
}
