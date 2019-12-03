package com.example.jjis;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ViewPDF extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    FirebaseAuth firebaseAuth;
    DatabaseReference databaseReference;
    ProgressBar progressBar;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    PDF pdfs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pdf);

        //back button in action bar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        final String pdfpath = getIntent().getStringExtra("path");

        pdfs = new PDF();
        progressBar = findViewById(R.id.progressbar);
        listView = findViewById(R.id.pdf_list);
        View emptyView = findViewById(R.id.empty_view);
        listView.setEmptyView(emptyView);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("" + pdfpath);
        list = new ArrayList<String>();
        adapter = new ArrayAdapter<>(this, R.layout.pdf_info, R.id.viewpdfinfo, list);

        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(final DataSnapshot dataSnapshot) {
                for (DataSnapshot ds : dataSnapshot.getChildren()) {
                    pdfs = ds.getValue(PDF.class);

                    DataSnapshot materialSnapshot = dataSnapshot.child("material");
                    Iterable<DataSnapshot> materialChildren = materialSnapshot.getChildren();
                    for (DataSnapshot material : materialChildren) {
                        list.add(material.getKey());
                    }
                }
                listView.setAdapter(adapter);
                progressBar.setVisibility(View.INVISIBLE);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        DataSnapshot materialSnapshot = dataSnapshot.child("material");
                        Iterable<DataSnapshot> materialChildren = materialSnapshot.getChildren();
                        for (DataSnapshot material : materialChildren) {
                            showpdf(material.getValue().toString());
                        }
                    }
                });
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Failed to read value
                Toast.makeText(ViewPDF.this, "Failed to retrieve data", Toast.LENGTH_LONG).show();
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