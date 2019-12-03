package com.example.jjis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Selector extends AppCompatActivity {

    TextView subname;
    CardView studymaterial, paper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);

        //back button in action bar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        subname = findViewById(R.id.subname);
        studymaterial = findViewById(R.id.studymaterial);
        paper = findViewById(R.id.paper);

        final String sub = getIntent().getStringExtra("subject_name");
        final String course = getIntent().getStringExtra("course_name");
        final String std = getIntent().getStringExtra("standard");
        final String show = course + " " + sub;
        subname.setText(show);

        studymaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(show.equals("GSEB" + " " + "Physics")) {
                Intent intent = new Intent(Selector.this, StudyMaterial.class);
                intent.putExtra("subject_name","Physics");
                intent.putExtra("course_name",course);
                intent.putExtra("standard", std);
                startActivity(intent);
            } else if(show.equals("GSEB" + " " + "Chemistry")) {
                Intent intent = new Intent(Selector.this, StudyMaterial.class);
                intent.putExtra("subject_name","Chemistry");
                intent.putExtra("course_name",course);
                intent.putExtra("standard", std);
                startActivity(intent);
            } else if(show.equals("GSEB" + " " + "Maths")) {
                Intent intent = new Intent(Selector.this, StudyMaterial.class);
                intent.putExtra("subject_name","Maths");
                intent.putExtra("course_name",course);
                intent.putExtra("standard", std);
                startActivity(intent);
            } else if(show.equals("GSEB" + " " + "Biology")) {
                Intent intent = new Intent(Selector.this, StudyMaterial.class);
                intent.putExtra("subject_name","Biology");
                intent.putExtra("course_name",course);
                intent.putExtra("standard", std);
                startActivity(intent);
            } else if(show.equals("GSEB" + " " + "Computer")) {
                Intent intent = new Intent(Selector.this, StudyMaterial.class);
                intent.putExtra("subject_name","Computer");
                intent.putExtra("course_name",course);
                intent.putExtra("standard", std);
                startActivity(intent);
            } else if(show.equals("GSEB" + " " + "English")) {
                Intent intent = new Intent(Selector.this, StudyMaterial.class);
                intent.putExtra("subject_name","English");
                intent.putExtra("course_name",course);
                intent.putExtra("standard", std);
                startActivity(intent);
            }
            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(show.equals("GSEB" + " " + "Physics")) {
                Intent intent = new Intent(Selector.this, Papers.class);
                intent.putExtra("subject_name","Physics");
                intent.putExtra("course_name",course);
                intent.putExtra("standard", std);
                startActivity(intent);
            } else if(show.equals("GSEB" + " " + "Chemistry")) {
                Intent intent = new Intent(Selector.this, Papers.class);
                intent.putExtra("subject_name","Chemistry");
                intent.putExtra("course_name",course);
                intent.putExtra("standard", std);
                startActivity(intent);
            } else if(show.equals("GSEB" + " " + "Maths")) {
                Intent intent = new Intent(Selector.this, Papers.class);
                intent.putExtra("subject_name","Maths");
                intent.putExtra("course_name",course);
                intent.putExtra("standard", std);
                startActivity(intent);
            } else if(show.equals("GSEB" + " " + "Biology")) {
                Intent intent = new Intent(Selector.this, Papers.class);
                intent.putExtra("subject_name","Biology");
                intent.putExtra("course_name",course);
                intent.putExtra("standard", std);
                startActivity(intent);
            } else if(show.equals("GSEB" + " " + "Computer")) {
                Intent intent = new Intent(Selector.this, Papers.class);
                intent.putExtra("subject_name","Computer");
                intent.putExtra("course_name",course);
                intent.putExtra("standard", std);
                startActivity(intent);
            } else if(show.equals("GSEB" + " " + "English")) {
                Intent intent = new Intent(Selector.this, Papers.class);
                intent.putExtra("subject_name","English");
                intent.putExtra("course_name",course);
                intent.putExtra("standard", std);
                startActivity(intent);
            }
            }
        });
    }

    // implementing back button
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
