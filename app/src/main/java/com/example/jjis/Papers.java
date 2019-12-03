package com.example.jjis;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Papers extends AppCompatActivity {

    TextView paper1TV, paper2TV, paper3TV, paper4TV, paper5TV, subname;
    CardView paper1, paper2, paper3, paper4, paper5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papers);

        //back button in action bar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        subname = findViewById(R.id.subname);

        paper1TV = findViewById(R.id.paper1TV); paper2TV = findViewById(R.id.paper2TV); paper3TV = findViewById(R.id.paper3TV);
        paper4TV = findViewById(R.id.paper4TV); paper5TV = findViewById(R.id.paper5TV);

        paper1 = findViewById(R.id.paper1); paper2 = findViewById(R.id.paper2); paper3 = findViewById(R.id.paper3);
        paper4 = findViewById(R.id.paper4); paper5 = findViewById(R.id.paper5);

        String sub = getIntent().getStringExtra("subject_name");
        String course = getIntent().getStringExtra("course_name");
        final String show = course + " " + sub;

//NAMING OF PAPER 1

        if(show.equals("GSEB" + " " + "Physics")) {
            paper1TV.setText("GSEB Physics 2015");
            paper2TV.setText("GSEB Physics 2016");
            paper3TV.setText("GSEB Physics 2017");
            paper4TV.setText("GSEB Physics 2018");
            paper5TV.setText("GSEB Physics 2019");

        } else if(show.equals("GSEB" + " " + "Chemistry")) {
            paper1TV.setText("GSEB Chemistry 2015");
            paper2TV.setText("GSEB Chemistry 2016");
            paper3TV.setText("GSEB Chemistry 2017");
            paper4TV.setText("GSEB Chemistry 2018");
            paper5TV.setText("GSEB Chemistry 2019");

        } else if(show.equals("GSEB" + " " + "Maths")) {
            paper1TV.setText("GSEB Maths 2015");
            paper2TV.setText("GSEB Maths 2016");
            paper3TV.setText("GSEB Maths 2017");
            paper4TV.setText("GSEB Maths 2018");
            paper5TV.setText("GSEB Maths 2019");

        } else if(show.equals("GSEB" + " " + "Biology")) {
            paper1TV.setText("GSEB Biology 2015");
            paper2TV.setText("GSEB Biology 2016");
            paper3TV.setText("GSEB Biology 2017");
            paper4TV.setText("GSEB Biology 2018");
            paper5TV.setText("GSEB Biology 2019");

        } else if(show.equals("GSEB" + " " + "Computer")) {
            paper1TV.setText("GSEB Computer 2015");
            paper2TV.setText("GSEB Computer 2016");
            paper3TV.setText("GSEB Computer 2017");
            paper4TV.setText("GSEB Computer 2018");
            paper5TV.setText("GSEB Computer 2019");

        } else if(show.equals("GSEB" + " " + "English")) {
            paper1TV.setText("GSEB English 2015");
            paper2TV.setText("GSEB English 2016");
            paper3TV.setText("GSEB English 2017");
            paper4TV.setText("GSEB English 2018");
            paper5TV.setText("GSEB English 2019");

        } else if(show.equals("GUJCET" + " " + "Physics")) {
            paper1TV.setText("GUJCET Physics 2015");
            paper2TV.setText("GUJCET Physics 2016");
            paper3TV.setText("GUJCET Physics 2017");
            paper4TV.setText("GUJCET Physics 2018");
            paper5TV.setText("GUJCET Physics 2019");

        } else if(show.equals("GUJCET" + " " + "Chemistry")) {
            paper2TV.setText("GUJCET Chemistry 2016");
            paper1TV.setText("GUJCET Chemistry 2015");
            paper3TV.setText("GUJCET Chemistry 2017");
            paper4TV.setText("GUJCET Chemistry 2018");
            paper5TV.setText("GUJCET Chemistry 2019");

        } else if(show.equals("GUJCET" + " " + "Maths")) {
            paper1TV.setText("GUJCET Maths 2015");
            paper2TV.setText("GUJCET Maths 2016");
            paper3TV.setText("GUJCET Maths 2017");
            paper4TV.setText("GUJCET Maths 2018");
            paper5TV.setText("GUJCET Maths 2019");

        } else if(show.equals("GUJCET" + " " + "Biology")) {
            paper1TV.setText("GUJCET Biology 2015");
            paper2TV.setText("GUJCET Biology 2016");
            paper3TV.setText("GUJCET Biology 2017");
            paper4TV.setText("GUJCET Biology 2018");
            paper5TV.setText("GUJCET Biology 2019");

        } else if(show.equals("JEE" + " " + "Physics")) {
            paper1TV.setText("JEE Physics 2015");
            paper2TV.setText("JEE Physics 2016");
            paper3TV.setText("JEE Physics 2017");
            paper4TV.setText("JEE Physics 2018");
            paper5TV.setText("JEE Physics 2019");

        } else if(show.equals("JEE" + " " + "Chemistry")) {
            paper1TV.setText("JEE Chemistry 2015");
            paper2TV.setText("JEE Chemistry 2016");
            paper3TV.setText("JEE Chemistry 2017");
            paper4TV.setText("JEE Chemistry 2018");
            paper5TV.setText("JEE Chemistry 2019");

        } else if(show.equals("JEE" + " " + "Maths")) {
            paper1TV.setText("JEE Maths 2015");
            paper2TV.setText("JEE Maths 2016");
            paper3TV.setText("JEE Maths 2017");
            paper4TV.setText("JEE Maths 2018");
            paper5TV.setText("JEE Maths 2019");

        }  else if(show.equals("NEET" + " " + "Physics")) {
            paper1TV.setText("NEET Physics 2015");
            paper2TV.setText("NEET Physics 2016");
            paper3TV.setText("NEET Physics 2017");
            paper4TV.setText("NEET Physics 2018");
            paper5TV.setText("NEET Physics 2019");

        } else if(show.equals("NEET" + " " + "Chemistry")) {
            paper1TV.setText("NEET Chemistry 2015");
            paper2TV.setText("NEET Chemistry 2016");
            paper3TV.setText("NEET Chemistry 2017");
            paper5TV.setText("NEET Chemistry 2019");
            paper4TV.setText("NEET Chemistry 2018");

        } else if(show.equals("NEET" + " " + "Biology")) {
            paper1TV.setText("NEET Biology 2015");
            paper2TV.setText("NEET Biology 2016");
            paper3TV.setText("NEET Biology 2017");
            paper4TV.setText("NEET Biology 2018");
            paper5TV.setText("NEET Biology 2019");

        }

//LINKING PATHS OF PAPER 1

        paper1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(show.equals("GSEB" + " " + "Physics")) {
                showpdf("https://firebasestorage.googleapis.com/v0/b/studymaterial-22589.appspot.com/o/Exam%2FGSEB%2F12%2FCOMPUTER%2FSTUDY%2F1.%20Creating%20HTML%20Forms%20Using%20KompoZer.pdf?alt=media&token=25f9bd4e-118b-46bf-b21a-0b7f9f5f72d1");
            } else if(show.equals("GSEB" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Maths")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Biology")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Computer")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "English")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Maths")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Biology")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("JEE" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("JEE" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("JEE" + " " + "Maths")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            }  else if(show.equals("NEET" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("NEET" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("NEET" + " " + "Biology")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            }
            }
        });

        paper2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(show.equals("GSEB" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Maths")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Biology")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Computer")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "English")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Maths")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Biology")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("JEE" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("JEE" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("JEE" + " " + "Maths")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            }  else if(show.equals("NEET" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("NEET" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("NEET" + " " + "Biology")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            }
            }
        });

        paper3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(show.equals("GSEB" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Maths")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Biology")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Computer")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "English")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Maths")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Biology")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("JEE" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("JEE" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("JEE" + " " + "Maths")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            }  else if(show.equals("NEET" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("NEET" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("NEET" + " " + "Biology")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            }
            }
        });

        paper4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(show.equals("GSEB" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Maths")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Biology")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Computer")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "English")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Maths")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Biology")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("JEE" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("JEE" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("JEE" + " " + "Maths")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            }  else if(show.equals("NEET" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("NEET" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("NEET" + " " + "Biology")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            }
            }
        });

        paper5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(show.equals("GSEB" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Maths")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Biology")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "Computer")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GSEB" + " " + "English")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Maths")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("GUJCET" + " " + "Biology")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("JEE" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("JEE" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("JEE" + " " + "Maths")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            }  else if(show.equals("NEET" + " " + "Physics")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("NEET" + " " + "Chemistry")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            } else if(show.equals("NEET" + " " + "Biology")) {
                Toast.makeText(Papers.this, " " + show, Toast.LENGTH_SHORT).show();
            }
            }
        });
    }

    private void showpdf(String pdf) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.parse(pdf), "application/pdf");
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        Intent newIntent = Intent.createChooser(intent, "Open File With");
        startActivity(newIntent);
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