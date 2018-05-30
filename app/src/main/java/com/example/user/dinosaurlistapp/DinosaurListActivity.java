package com.example.user.dinosaurlistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(dinosaurListAdapter);
    }
}
