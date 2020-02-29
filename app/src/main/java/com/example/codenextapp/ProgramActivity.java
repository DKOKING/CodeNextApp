package com.example.codenextapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ProgramActivity extends AppCompatActivity {

    ListView listView;
    ListView listView2;
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> names2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);

        listView = findViewById(R.id.cdprogram);
        listView2 = findViewById(R.id.cdclubs);
        names.add(new String("Foundations"));
        names.add(new String("Team Edge") );
        names.add(new String("Launch"));
        names.add(new String("Bootcamps"));
        names.add(new String("Community Workshops"));

        names2.add(new String("Minecraft Mondays"));
        names2.add(new String("Creative Coding") );
        names2.add(new String("AI"));
        names2.add(new String("Python MC"));
        names2.add(new String("Cybersecurity"));
        names2.add(new String("Platform Game Development"));
        names2.add(new String("Graphic Design"));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names );
        listView.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names2 );
        listView2.setAdapter(adapter2);
    }
}
