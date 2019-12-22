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

//ASSIGNING PDF LINKS
    String
    gseb_phy_1 = "",
    gseb_phy_2 = "",
    gseb_phy_3 = "",
    gseb_phy_4 = "",
    gseb_phy_5 = "",
    gseb_chem_1 = "",
    gseb_chem_2 = "",
    gseb_chem_3 = "",
    gseb_chem_4 = "",
    gseb_chem_5 = "",
    gseb_maths_1 = "https://firebasestorage.googleapis.com/v0/b/jjisapp.appspot.com/o/GSEB%20papers%2Fmaths%2FMaths%202015.pdf?alt=media&token=5fb3e91a-da61-4d9f-ad90-6084ed4c7414",
    gseb_maths_2 = "",
    gseb_maths_3 = "",
    gseb_maths_4 = "",
    gseb_maths_5 = "",
    gseb_bio_1 = "",
    gseb_bio_2 = "",
    gseb_bio_3 = "",
    gseb_bio_4 = "",
    gseb_bio_5 = "",
    gseb_eng_1 = "",
    gseb_eng_2 = "",
    gseb_eng_3 = "",
    gseb_eng_4 = "",
    gseb_eng_5 = "",
    gseb_comp_1 = "",
    gseb_comp_2 = "",
    gseb_comp_3 = "",
    gseb_comp_4 = "",
    gseb_comp_5 = "",
    gujcet_phy_1 = "",
    gujcet_phy_2 = "",
    gujcet_phy_3 = "",
    gujcet_phy_4 = "",
    gujcet_phy_5 = "",
    gujcet_chem_1 = "",
    gujcet_chem_2 = "",
    gujcet_chem_3 = "",
    gujcet_chem_4 = "",
    gujcet_chem_5 = "",
    gujcet_maths_1 = "",
    gujcet_maths_2 = "",
    gujcet_maths_3 = "",
    gujcet_maths_4 = "",
    gujcet_maths_5 = "",
    gujcet_bio_1 = "",
    gujcet_bio_2 = "",
    gujcet_bio_3 = "",
    gujcet_bio_4 = "",
    gujcet_bio_5 = "",
    jee_phy_1 = "",
    jee_phy_2 = "",
    jee_phy_3 = "",
    jee_phy_4 = "",
    jee_phy_5 = "",
    jee_chem_1 = "",
    jee_chem_2 = "",
    jee_chem_3 = "",
    jee_chem_4 = "",
    jee_chem_5 = "",
    jee_maths_1 = "",
    jee_maths_2 = "",
    jee_maths_3 = "",
    jee_maths_4 = "",
    jee_maths_5 = "",
    neet_phy_1 = "",
    neet_phy_2 = "",
    neet_phy_3 = "",
    neet_phy_4 = "",
    neet_phy_5 = "",
    neet_chem_1 = "",
    neet_chem_2 = "",
    neet_chem_3 = "",
    neet_chem_4 = "",
    neet_chem_5 = "",
    neet_bio_1 = "",
    neet_bio_2 = "",
    neet_bio_3 = "",
    neet_bio_4 = "",
    neet_bio_5 = "";

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

//NAMING OF PAPERS

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

//LINKING PATHS OF PAPERS

        paper1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(show.equals("GSEB" + " " + "Physics")) {
                showpdf(gseb_phy_1);
            } else if(show.equals("GSEB" + " " + "Chemistry")) {
                showpdf(gseb_chem_1);
            } else if(show.equals("GSEB" + " " + "Maths")) {
                showpdf(gseb_maths_1);
            } else if(show.equals("GSEB" + " " + "Biology")) {
                showpdf(gseb_bio_1);
            } else if(show.equals("GSEB" + " " + "Computer")) {
                showpdf(gseb_comp_1);
            } else if(show.equals("GSEB" + " " + "English")) {
                showpdf(gseb_eng_1);
            } else if(show.equals("GUJCET" + " " + "Physics")) {
                showpdf(gujcet_phy_1);
            } else if(show.equals("GUJCET" + " " + "Chemistry")) {
                showpdf(gujcet_chem_1);
            } else if(show.equals("GUJCET" + " " + "Maths")) {
                showpdf(gujcet_maths_1);
            } else if(show.equals("GUJCET" + " " + "Biology")) {
                showpdf(gujcet_bio_1);
            } else if(show.equals("JEE" + " " + "Physics")) {
                showpdf(jee_phy_1);
            } else if(show.equals("JEE" + " " + "Chemistry")) {
                showpdf(jee_chem_1);
            } else if(show.equals("JEE" + " " + "Maths")) {
                showpdf(jee_maths_1);
            }  else if(show.equals("NEET" + " " + "Physics")) {
                showpdf(neet_phy_1);
            } else if(show.equals("NEET" + " " + "Chemistry")) {
                showpdf(neet_chem_1);
            } else if(show.equals("NEET" + " " + "Biology")) {
                showpdf(neet_bio_1);
            }
            }
        });

        paper2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(show.equals("GSEB" + " " + "Physics")) {
                showpdf(gseb_phy_2);
            } else if(show.equals("GSEB" + " " + "Chemistry")) {
                showpdf(gseb_chem_2);
            } else if(show.equals("GSEB" + " " + "Maths")) {
                showpdf(gseb_maths_2);
            } else if(show.equals("GSEB" + " " + "Biology")) {
                showpdf(gseb_bio_2);
            } else if(show.equals("GSEB" + " " + "Computer")) {
                showpdf(gseb_comp_2);
            } else if(show.equals("GSEB" + " " + "English")) {
                showpdf(gseb_eng_2);
            } else if(show.equals("GUJCET" + " " + "Physics")) {
                showpdf(gujcet_phy_2);
            } else if(show.equals("GUJCET" + " " + "Chemistry")) {
                showpdf(gujcet_chem_2);
            } else if(show.equals("GUJCET" + " " + "Maths")) {
                showpdf(gujcet_maths_2);
            } else if(show.equals("GUJCET" + " " + "Biology")) {
                showpdf(gujcet_bio_2);
            } else if(show.equals("JEE" + " " + "Physics")) {
                showpdf(jee_phy_2);
            } else if(show.equals("JEE" + " " + "Chemistry")) {
                showpdf(jee_chem_2);
            } else if(show.equals("JEE" + " " + "Maths")) {
                showpdf(jee_maths_2);
            }  else if(show.equals("NEET" + " " + "Physics")) {
                showpdf(neet_phy_2);
            } else if(show.equals("NEET" + " " + "Chemistry")) {
                showpdf(neet_chem_2);
            } else if(show.equals("NEET" + " " + "Biology")) {
                showpdf(neet_bio_2);
            }
            }
        });

        paper3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(show.equals("GSEB" + " " + "Physics")) {
                showpdf(gseb_phy_3);
            } else if(show.equals("GSEB" + " " + "Chemistry")) {
                showpdf(gseb_chem_3);
            } else if(show.equals("GSEB" + " " + "Maths")) {
                showpdf(gseb_maths_3);
            } else if(show.equals("GSEB" + " " + "Biology")) {
                showpdf(gseb_bio_3);
            } else if(show.equals("GSEB" + " " + "Computer")) {
                showpdf(gseb_comp_3);
            } else if(show.equals("GSEB" + " " + "English")) {
                showpdf(gseb_eng_3);
            } else if(show.equals("GUJCET" + " " + "Physics")) {
                showpdf(gujcet_phy_3);
            } else if(show.equals("GUJCET" + " " + "Chemistry")) {
                showpdf(gujcet_chem_3);
            } else if(show.equals("GUJCET" + " " + "Maths")) {
                showpdf(gujcet_maths_3);
            } else if(show.equals("GUJCET" + " " + "Biology")) {
                showpdf(gujcet_bio_3);
            } else if(show.equals("JEE" + " " + "Physics")) {
                showpdf(jee_phy_3);
            } else if(show.equals("JEE" + " " + "Chemistry")) {
                showpdf(jee_chem_3);
            } else if(show.equals("JEE" + " " + "Maths")) {
                showpdf(jee_maths_3);
            }  else if(show.equals("NEET" + " " + "Physics")) {
                showpdf(neet_phy_3);
            } else if(show.equals("NEET" + " " + "Chemistry")) {
                showpdf(neet_chem_3);
            } else if(show.equals("NEET" + " " + "Biology")) {
                showpdf(neet_bio_3);
            }
            }
        });

        paper4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(show.equals("GSEB" + " " + "Physics")) {
                showpdf(gseb_phy_4);
            } else if(show.equals("GSEB" + " " + "Chemistry")) {
                showpdf(gseb_chem_4);
            } else if(show.equals("GSEB" + " " + "Maths")) {
                showpdf(gseb_maths_4);
            } else if(show.equals("GSEB" + " " + "Biology")) {
                showpdf(gseb_bio_4);
            } else if(show.equals("GSEB" + " " + "Computer")) {
                showpdf(gseb_comp_4);
            } else if(show.equals("GSEB" + " " + "English")) {
                showpdf(gseb_eng_4);
            } else if(show.equals("GUJCET" + " " + "Physics")) {
                showpdf(gujcet_phy_4);
            } else if(show.equals("GUJCET" + " " + "Chemistry")) {
                showpdf(gujcet_chem_4);
            } else if(show.equals("GUJCET" + " " + "Maths")) {
                showpdf(gujcet_maths_4);
            } else if(show.equals("GUJCET" + " " + "Biology")) {
                showpdf(gujcet_bio_4);
            } else if(show.equals("JEE" + " " + "Physics")) {
                showpdf(jee_phy_4);
            } else if(show.equals("JEE" + " " + "Chemistry")) {
                showpdf(jee_chem_4);
            } else if(show.equals("JEE" + " " + "Maths")) {
                showpdf(jee_maths_4);
            }  else if(show.equals("NEET" + " " + "Physics")) {
                showpdf(neet_phy_4);
            } else if(show.equals("NEET" + " " + "Chemistry")) {
                showpdf(neet_chem_4);
            } else if(show.equals("NEET" + " " + "Biology")) {
                showpdf(neet_bio_4);
            }
            }
        });

        paper5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(show.equals("GSEB" + " " + "Physics")) {
                showpdf(gseb_phy_5);
            } else if(show.equals("GSEB" + " " + "Chemistry")) {
                showpdf(gseb_chem_5);
            } else if(show.equals("GSEB" + " " + "Maths")) {
                showpdf(gseb_maths_5);
            } else if(show.equals("GSEB" + " " + "Biology")) {
                showpdf(gseb_bio_5);
            } else if(show.equals("GSEB" + " " + "Computer")) {
                showpdf(gseb_comp_5);
            } else if(show.equals("GSEB" + " " + "English")) {
                showpdf(gseb_eng_5);
            } else if(show.equals("GUJCET" + " " + "Physics")) {
                showpdf(gujcet_phy_5);
            } else if(show.equals("GUJCET" + " " + "Chemistry")) {
                showpdf(gujcet_chem_5);
            } else if(show.equals("GUJCET" + " " + "Maths")) {
                showpdf(gujcet_maths_5);
            } else if(show.equals("GUJCET" + " " + "Biology")) {
                showpdf(gujcet_bio_5);
            } else if(show.equals("JEE" + " " + "Physics")) {
                showpdf(jee_phy_5);
            } else if(show.equals("JEE" + " " + "Chemistry")) {
                showpdf(jee_chem_5);
            } else if(show.equals("JEE" + " " + "Maths")) {
                showpdf(jee_maths_5);
            }  else if(show.equals("NEET" + " " + "Physics")) {
                showpdf(neet_phy_5);
            } else if(show.equals("NEET" + " " + "Chemistry")) {
                showpdf(neet_chem_5);
            } else if(show.equals("NEET" + " " + "Biology")) {
                showpdf(neet_bio_5);
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