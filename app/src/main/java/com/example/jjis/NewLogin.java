package com.example.jjis;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class NewLogin extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    EditText username, password;
    Button loginbtn;
    ProgressDialog progressDialog;
    Credentials credentials;
    SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_login);

        session = new SessionManager(getApplicationContext());

        if(!isConnected(NewLogin.this))
        {
            buildDialog(NewLogin.this).show();
        }

        //initializing views
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginbtn = findViewById(R.id.loginbtn);
        progressDialog = new ProgressDialog(this);

        firebaseDatabase = FirebaseDatabase.getInstance();

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //checking if email and passwords are empty
                if(TextUtils.isEmpty(username.getText())) {
                    Toast.makeText(NewLogin.this,"Please enter email",Toast.LENGTH_LONG).show();
                    return;
                }

                if(TextUtils.isEmpty(password.getText())) {
                    Toast.makeText(NewLogin.this,"Please enter password",Toast.LENGTH_LONG).show();
                    return;
                }

                if(password.length() < 6 || password.length() > 10) {
                    password.setError("Password should be between 6 to 10 characters");
                    return;
                }

                //if the email and password are not empty displaying a progress dialog
                progressDialog.setMessage("Logging in...");
                progressDialog.show();

                databaseReference = firebaseDatabase.getReference("LOGIN_ID").child(String.valueOf(username.getText()));
                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        credentials = dataSnapshot.getValue(Credentials.class);
                        if(String.valueOf(password.getText()).equals(credentials.getPassword())){
                            if(credentials.getLogin_no() == 0) {
                                progressDialog.dismiss();
                                databaseReference.child("login_no").setValue(1);
                                session.createLoginSession("" + username.getText().toString(), "" + password.getText().toString());
                                startActivity(new Intent(getApplicationContext(), Dashboard.class));

                            } else {
                                progressDialog.dismiss();
                                final Dialog dialog = new Dialog(NewLogin.this);
                                dialog.setContentView(R.layout.multi_login_error);
                                Button ok = dialog.findViewById(R.id.ok);
                                dialog.setCancelable(true);

                                ok.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        dialog.dismiss();
                                    }
                                });
                                dialog.show();
                            }
                        } else {
                            progressDialog.dismiss();
                            Toast.makeText(NewLogin.this, "Incorrect password. Please try again...", Toast.LENGTH_SHORT).show();
                        }
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Toast.makeText(NewLogin.this, "Try again later!", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
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
        builder.setMessage("Please check your internet connnectivity. Retry after sometime!!!");
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
       return builder;
    }

    // Internet detection code ends
}