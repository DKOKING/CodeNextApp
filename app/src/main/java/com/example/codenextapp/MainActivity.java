package com.example.codenextapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button team;
    Button program;
    Button event;
    Button apply;
    TextView codeNext;
    TextView where;
    ArrayList<Coaches> coaches = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team = findViewById(R.id.team);
        program = findViewById(R.id.programs);
        event = findViewById(R.id.events);
        apply = findViewById(R.id.apply);
        codeNext = findViewById(R.id.codeNext);
        where = findViewById(R.id.locations);

        coaches.add(new Coaches("Donna", "coachdonna@csedge.org"));
        coaches.add(new Coaches("Jason", "coachjason@csedge.org"));
        coaches.add(new Coaches("Natalie", "coachnatalie@csedge.org"));
        coaches.add(new Coaches("Alyssa", "coachalyssa@csedge.org"));
        coaches.add(new Coaches("Blanca", "coachblanca@csedge.org"));
        coaches.add(new Coaches("Wolf", "coachwolf@csedge.org"));
        coaches.add(new Coaches("Shaquan", "coachshaquan@csedge.org"));


    }

    public void info(View view){
        int viewId = view.getId();
        Intent intent;
        if(viewId == R.id.codeNext){
            System.out.println("Int if lock");
            intent = new Intent(MainActivity.this, Information.class);
            intent.putExtra("information", "Code Next is a free, computer science education program that meets Black and Latinx high school students in their own communities and provides the skills and inspiration they need for long and rewarding careers in computer science-related fields.");
        }
        else{
            System.out.println("Int else lock");
            intent = new Intent(MainActivity.this, Information.class);
            intent.putExtra("information", "The CodeNext sites are at Chelsea, New York, Harlem, New York, & Oakland, California. The Chelsea and Oakland sites are located at Google building sites, and the Harlem CodeNext site is located at the Boys & Girls Club of Harlem ELiTE High School. ");
        }
        startActivity(intent);

    }


    public void Team(View view){
        Intent intent = new Intent(MainActivity.this, TeamActivity.class);
        startActivity(intent);

    }

    public void Program(View view){
        Intent intent = new Intent(MainActivity.this, ProgramActivity.class);
        startActivity(intent);

    }

    public void Login(View view){
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);

    }


}
