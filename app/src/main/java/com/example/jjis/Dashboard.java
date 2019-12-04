package com.example.jjis;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Dashboard extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    CardView gseb, gujcet, jee, neet;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        /*if(!isConnected(Dashboard.this))
        {
            buildDialog(Dashboard.this).show();
        }*/

        gseb = findViewById(R.id.gseb);
        gujcet = findViewById(R.id.gujcet);
        jee = findViewById(R.id.jee);
        neet = findViewById(R.id.neet);

        gseb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            final Dialog dialog= new Dialog(Dashboard.this);
            dialog.setContentView(R.layout.std_selector);
            final Button eleven = dialog.findViewById(R.id.eleven);
            final Button twelve = dialog.findViewById(R.id.twelve);

            eleven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent= new Intent(Dashboard.this,Subjects.class);
                    intent.putExtra("course_name","GSEB");
                    intent.putExtra("standard","11");
                    startActivity(intent);
                }
            });

            twelve.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent= new Intent(Dashboard.this,Subjects.class);
                    intent.putExtra("course_name","GSEB");
                    intent.putExtra("standard","12");
                    startActivity(intent);
                }
            });

            dialog.show();
            }
        });

        gujcet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Dashboard.this,Subjects.class);
                intent.putExtra("course_name","GUJCET");
                startActivity(intent);
            }
        });

        jee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Dashboard.this,Subjects.class);
                intent.putExtra("course_name","JEE");
                startActivity(intent);
            }
        });

        neet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Dashboard.this,Subjects.class);
                intent.putExtra("course_name","NEET");
                startActivity(intent);
            }
        });

        // toolbar activity starts

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("JJIS");
        toolbar.setSubtitle("Excellence has no limit!!!");

        // toolbar activity ends

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    //Internet detection code Start

    public boolean isConnected(Context context) {

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo = cm.getActiveNetworkInfo();

        if (netinfo != null && netinfo.isConnectedOrConnecting()) {
            NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if((mobile != null && mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting())) return true;
            else return false;
        } else
            return false;
    }

    public AlertDialog.Builder buildDialog(Context c) {

        AlertDialog.Builder builder = new AlertDialog.Builder(c);
        builder.setCancelable(false);
        builder.setTitle("No Internet Connection");
        builder.setMessage("Please check your internet connectivity. Retry after sometime!!!");

        builder.setNeutralButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setNegativeButton("Try Again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                startActivity(getIntent());
            }
        });

        /*builder.setPositiveButton("Turn On!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent();
                i.setAction(Settings.ACTION_DATA_USAGE_SETTINGS);
                startActivity(i);
            }
        });*/

        return builder;
    }

    // Internet detection code ends

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_gseb) {
            Intent intent= new Intent(Dashboard.this,Subjects.class);
            intent.putExtra("course_name","GSEB");
            startActivity(intent);

        } else if (id == R.id.nav_gujcet) {
            Intent intent= new Intent(Dashboard.this,Subjects.class);
            intent.putExtra("course_name","GUJCET");
            startActivity(intent);

        } else if (id == R.id.nav_jee) {
            Intent intent= new Intent(Dashboard.this,Subjects.class);
            intent.putExtra("course_name","JEE");
            startActivity(intent);

        } else if (id == R.id.nav_neet) {
            Intent intent= new Intent(Dashboard.this,Subjects.class);
            intent.putExtra("course_name","NEET");
            startActivity(intent);

        } else if (id == R.id.nav_logout) {
            //logging out the user
            firebaseAuth.signOut();
            finish();
            startActivity(new Intent(Dashboard.this, Login.class));

        } else if (id == R.id.nav_info) {
            startActivity(new Intent(getApplicationContext(), Info.class));

        } else if (id == R.id.nav_share) {
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT,"Subject here");
            sharingIntent.putExtra(Intent.EXTRA_TEXT, "Check it out. Your message goes here");
            startActivity(Intent.createChooser(sharingIntent, "Sharing Options"));
            return true;

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}