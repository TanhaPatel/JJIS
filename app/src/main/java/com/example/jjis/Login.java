package com.example.jjis;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    EditText emailet, passwordet;
    Button loginbtn;
    ProgressDialog progressDialog;
    FirebaseAuth firebaseAuth;
    GoogleSignInClient mGoogleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if(!isConnected(Login.this))
        {
            buildDialog(Login.this).show();
        }

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        //getting firebase auth object
        firebaseAuth = FirebaseAuth.getInstance();

        //if the objects getcurrentuser method is not null
        //means user is already logged in
        if(firebaseAuth.getCurrentUser() != null){
            //close this activity
            finish();
            //opening profile activity
            startActivity(new Intent(getApplicationContext(), Students_Dashboard.class));
        }

        //initializing views
        emailet = findViewById(R.id.email);
        passwordet = findViewById(R.id.password);
        loginbtn = findViewById(R.id.loginbtn);

        progressDialog = new ProgressDialog(this);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = emailet.getText().toString().trim();
                String password = passwordet.getText().toString().trim();

                //checking if email and passwords are empty
                if(TextUtils.isEmpty(email)) {
                    Toast.makeText(Login.this,"Please enter email",Toast.LENGTH_LONG).show();
                    return;
                }

                if(TextUtils.isEmpty(password)) {
                    Toast.makeText(Login.this,"Please enter password",Toast.LENGTH_LONG).show();
                    return;
                }

                if(password.length() < 6 || password.length() > 10) {
                    passwordet.setError("Password should be between 6 to 10 characters");
                    return;
                }

                //if the email and password are not empty
                //displaying a progress dialog
                progressDialog.setMessage("Logging in...");
                progressDialog.show();

                //logging in the user
                firebaseAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progressDialog.dismiss();
                            //if the task is successfull
                            if(task.isSuccessful()){
                                //start the profile activity
                                String ext = email.substring(email.indexOf("@") + 1);
                                Toast.makeText(Login.this, ""+ext, Toast.LENGTH_SHORT).show();

                                finish();
                                if(ext.equals("jjis.edu.in")) {
                                    startActivity(new Intent(getApplicationContext(), Students_Dashboard.class));
                                }/*else if(ext.equals("jjis.ac.in")) {
                                    startActivity(new Intent(getApplicationContext(), Teachers_Dashboard.class));
                                }*/
                            }
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

        /*builder.setPositiveButton("Turn On!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent();
                i.setAction(Settings.ACTION_DATA_USAGE_SETTINGS);
                startActivity(i);
            }
        });*/        return builder;
    }

    // Internet detection code ends
}