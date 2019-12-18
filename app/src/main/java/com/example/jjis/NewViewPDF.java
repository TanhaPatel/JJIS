package com.example.jjis;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
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
import java.util.List;

public class NewViewPDF extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    FirebaseAuth firebaseAuth;
    DatabaseReference databaseReference;
    ProgressBar progressBar;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    NewPDF pdfs;
    List<NewPDF> pdf_1;
    String pdfpath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pdf);

        //back button in action bar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        pdfpath = getIntent().getStringExtra("path");

        pdf_1=new ArrayList<>();

        Viewallpdfs();
    }

    //to view pdfs

    private void Viewallpdfs() {
        databaseReference= FirebaseDatabase.getInstance().getReference(pdfpath);

        //adapter = new ArrayAdapter<String>(this,R.layout.new_pdf_info,R.id.viewpdfinfo,list);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot postsnapshot:dataSnapshot.getChildren()){

                    NewPDF pdf_2=postsnapshot.getValue(NewPDF.class);
                    pdf_1.add(pdf_2);
                }
                String [] pdf_s = new String[pdf_1.size()];

                for(int i=0;i<pdf_s.length;i++){

                    pdf_s[i]=pdf_1.get(i).getName();
                }

                listView.setAdapter(adapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        NewPDF pdf_3= pdf_1.get(position);

                        showpdf(pdf_3.getUrl());
                        //showpdf(pdf_1.getlink().toString());

                        // Intent intent=new Intent();
                        //intent.setData(Uri.parse(upload_class2.getUrl()));
                        //  myurl = upload_class2.getUrl().toString();
                        // intent.putExtra()*/
                        /* startActivity(new Intent(My_pdfs.this,Pdf_viewer.class));*/

                /*Intent intent=new Intent(My_pdfs.this,Pdf_viewer.class);
                intent.putExtra("Link",upload_class2.getUrl().toString());
                startActivity(intent);*/
                    }
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

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