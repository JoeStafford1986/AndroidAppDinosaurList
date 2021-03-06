package com.example.user.dinosaurlistapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class DinosaurListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinosaur_list);

        DinosaurList dinosaurList = new DinosaurList();
        ArrayList<Dinosaur> list = dinosaurList.getList();

        DinosaurListAdapter dinosaurListAdapter = new DinosaurListAdapter(this, list);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(dinosaurListAdapter);
    }

    public void getItem(View listItem) {
        Dinosaur dinosaur = (Dinosaur) listItem.getTag();
        Intent intent = new Intent(this, DinosaurActivity.class);
        intent.putExtra("dinosaur", dinosaur);
        startActivity(intent);
    }
}
