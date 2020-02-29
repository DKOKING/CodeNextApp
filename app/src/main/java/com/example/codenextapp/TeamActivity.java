package com.example.codenextapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

public class TeamActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Coaches> coaches = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        listView = findViewById(R.id.list);

        /*listView = findViewById(R.id.list);
        names.add(new String("Coach Jason"));
        names.add(new String("Coach Donna") );
        names.add(new String("Coach Stephanie"));
        names.add(new String("Coach Blanca"));
        names.add(new String("Coach Alyssa"));
        names.add(new String("Coach Peta"));
        names.add(new String("Coach Natalie"));*/

        coaches.add(new Coaches("Donna", "coachdonna@csedge.org"));
        coaches.add(new Coaches("Jason", "coachjason@csedge.org"));
        coaches.add(new Coaches("Natalie", "coachnatalie@csedge.org"));
        coaches.add(new Coaches("Alyssa", "coachalyssa@csedge.org"));
        coaches.add(new Coaches("Blanca", "coachblanca@csedge.org"));
        coaches.add(new Coaches("Wolf", "coachwolf@csedge.org"));
        coaches.add(new Coaches("Shaquan", "coachshaquan@csedge.org"));


        CoachArrayAdapter coachArrayAdapter = new CoachArrayAdapter(this, R.layout.custom_array, coaches);

        listView.setAdapter(coachArrayAdapter);




    }



}
