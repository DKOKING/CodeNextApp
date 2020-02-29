package com.example.codenextapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.codenextapp.Coaches;
import com.example.codenextapp.R;

import java.util.ArrayList;
import java.util.List;

public class CoachArrayAdapter extends ArrayAdapter<Coaches> {

    Context myContext;
    int myResource;

    public CoachArrayAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Coaches> objects) {
        super(context, resource, objects);
        myContext = context;
        myResource = resource;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String name = getItem(position).getNames();
        String email = getItem(position).getEmail();

        LayoutInflater inflater = LayoutInflater.from(myContext);
        convertView = inflater.inflate(myResource, parent, false);

        TextView coachName = (TextView) convertView.findViewById(R.id.coachName);
        TextView coachEmail = (TextView) convertView.findViewById(R.id.coachEmail);

        coachName.setText(name);
        coachEmail.setText(email);

        return convertView;

    }
}
