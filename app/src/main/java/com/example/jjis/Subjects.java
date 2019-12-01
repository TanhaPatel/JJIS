package com.example.jjis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Subjects extends AppCompatActivity {

    TextView coursename;
    CardView phy, chem, maths, bio, comp, eng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        coursename = findViewById(R.id.coursename);
        phy = findViewById(R.id.phy);
        chem = findViewById(R.id.chem);
        maths = findViewById(R.id.maths);
        bio = findViewById(R.id.bio);
        comp = findViewById(R.id.comp);
        eng = findViewById(R.id.eng);

        final String course = getIntent().getStringExtra("course_name");
        final String std = getIntent().getStringExtra("standard");
        String standard = course + std;
        coursename.setText(course);

        if(standard.equals("GSEB" + "11")) {
            phy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Subjects.this, Selector.class);
                    intent.putExtra("subject_name","Physics");
                    intent.putExtra("course_name",course);
                    intent.putExtra("standard", std);
                    startActivity(intent);
                }
            });

            chem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Subjects.this, Selector.class);
                    intent.putExtra("subject_name","Chemistry");
                    intent.putExtra("course_name",course);
                    intent.putExtra("standard", std);
                    startActivity(intent);
                }
            });

            maths.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Subjects.this, Selector.class);
                    intent.putExtra("subject_name","Maths");
                    intent.putExtra("course_name",course);
                    intent.putExtra("standard", std);
                    startActivity(intent);
                }
            });

            bio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Subjects.this, Selector.class);
                    intent.putExtra("subject_name","Biology");
                    intent.putExtra("course_name",course);
                    intent.putExtra("standard", std);
                    startActivity(intent);
                }
            });

            comp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Subjects.this, Selector.class);
                    intent.putExtra("subject_name","Computer");
                    intent.putExtra("course_name",course);
                    intent.putExtra("standard", std);
                    startActivity(intent);
                }
            });

            eng.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Subjects.this, Selector.class);
                    intent.putExtra("subject_name","English");
                    intent.putExtra("course_name",course);
                    intent.putExtra("standard", std);
                    startActivity(intent);
                }
            });
        }

        if(standard.equals("GSEB" + "12")) {
            phy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Subjects.this, Selector.class);
                    intent.putExtra("subject_name","Physics");
                    intent.putExtra("course_name",course);
                    intent.putExtra("standard", std);
                    startActivity(intent);
                }
            });

            chem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Subjects.this, Selector.class);
                    intent.putExtra("subject_name","Chemistry");
                    intent.putExtra("course_name",course);
                    intent.putExtra("standard", std);
                    startActivity(intent);
                }
            });

            maths.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Subjects.this, Selector.class);
                    intent.putExtra("subject_name","Maths");
                    intent.putExtra("course_name",course);
                    intent.putExtra("standard", std);
                    startActivity(intent);
                }
            });

            bio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Subjects.this, Selector.class);
                    intent.putExtra("subject_name","Biology");
                    intent.putExtra("course_name",course);
                    intent.putExtra("standard", std);
                    startActivity(intent);
                }
            });

            comp.setOnClickListener(new View.OnClickListener() {
                @Override
                    public void onClick(View v) {
                    Intent intent = new Intent(Subjects.this, Selector.class);
                    intent.putExtra("subject_name","Computer");
                    intent.putExtra("course_name",course);
                    intent.putExtra("standard", std);
                    startActivity(intent);
                }
            });

            eng.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Subjects.this, Selector.class);
                    intent.putExtra("subject_name","English");
                    intent.putExtra("course_name",course);
                    intent.putExtra("standard", std);
                    startActivity(intent);
                }
            });
        }

        if(course.equals("GUJCET")) {
            phy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                Intent intent = new Intent(Subjects.this, Papers.class);
                intent.putExtra("subject_name","Physics");
                intent.putExtra("course_name",course);
                startActivity(intent);
                }
            });

            chem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                Intent intent = new Intent(Subjects.this, Papers.class);
                intent.putExtra("subject_name","Chemistry");
                intent.putExtra("course_name",course);
                startActivity(intent);
                }
            });

            maths.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                Intent intent = new Intent(Subjects.this, Papers.class);
                intent.putExtra("subject_name","Maths");
                intent.putExtra("course_name",course);
                startActivity(intent);
                }
            });

            bio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                Intent intent = new Intent(Subjects.this, Papers.class);
                intent.putExtra("subject_name","Biology");
                intent.putExtra("course_name",course);
                startActivity(intent);
                }
            });

            comp.setVisibility(View.GONE);
            eng.setVisibility(View.GONE);

        }

        if(course.equals("JEE")) {
            phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(Subjects.this, Papers.class);
               intent.putExtra("subject_name","Physics");
               intent.putExtra("course_name",course);
               startActivity(intent);
            }
            });

            chem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Subjects.this, Papers.class);
                intent.putExtra("subject_name","Chemistry");
                intent.putExtra("course_name",course);
                startActivity(intent);
            }
            });

            maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Subjects.this, Papers.class);
                intent.putExtra("subject_name","Maths");
                intent.putExtra("course_name",course);
                startActivity(intent);
            }
            });

            bio.setVisibility(View.GONE);
            comp.setVisibility(View.GONE);
            eng.setVisibility(View.GONE);
        }

        if(course.equals("NEET")) {
            phy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                Intent intent = new Intent(Subjects.this, Papers.class);
                intent.putExtra("subject_name","Physics");
                intent.putExtra("course_name",course);
                startActivity(intent);
                }
            });

            chem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                Intent intent = new Intent(Subjects.this, Papers.class);
                intent.putExtra("subject_name","Chemistry");
                intent.putExtra("course_name",course);
                startActivity(intent);
                }
            });

            bio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                Intent intent = new Intent(Subjects.this, Papers.class);
                intent.putExtra("subject_name","Biology");
                intent.putExtra("course_name",course);
                startActivity(intent);
                }
            });

            maths.setVisibility(View.GONE);
            comp.setVisibility(View.GONE);
            eng.setVisibility(View.GONE);
        }
    }
}