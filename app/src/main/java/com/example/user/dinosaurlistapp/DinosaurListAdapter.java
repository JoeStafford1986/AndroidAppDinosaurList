package com.example.user.dinosaurlistapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class DinosaurListAdapter extends ArrayAdapter<Dinosaur> {

    public DinosaurListAdapter(Context context, ArrayList<Dinosaur> dinosaurList) {
        super(context, 0, dinosaurList);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.dinosaur_item, parent, false);
        }

        Dinosaur currentDinosaur = getItem(position);

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentDinosaur.getName());

        TextView length = (TextView) listItemView.findViewById(R.id.length);
        length.setText(currentDinosaur.getLength().toString());

        TextView weight = (TextView) listItemView.findViewById(R.id.weight);
        weight.setText(currentDinosaur.getWeight().toString());

        return listItemView;
    }

}
