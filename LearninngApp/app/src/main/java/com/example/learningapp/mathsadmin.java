package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mathsadmin extends AppCompatActivity {
    private long backPressedTime;
    Button logout;
    SharedPreferences loginPreferences;
    SharedPreferences.Editor loginPrefsEditor;
    Intent intentLogin;
    TextView textViewName;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathsadmin);
        loginPreferences = getSharedPreferences("loginPrefs", Context.MODE_PRIVATE);

        user usr = new user();

        usr.name = loginPreferences.getString("username","");




        textViewName = (TextView)findViewById(R.id.textViewName);

        logout = (Button)findViewById(R.id.btnLogout);
        intentLogin = new Intent(mathsadmin.this,LoginActivity.class);

        textViewName.setText(loginPreferences.getString("username",""));

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor editor = loginPreferences.edit();
                editor.clear();
                editor.commit();
                startActivity(intentLogin);

            }
        });

        if (loginPreferences.getString("username","")== null) {

            startActivity(intentLogin);
        }
    }

    public void mathslessons (View view) {
        startActivity(new Intent(this, AddmathsLesson.class));
    }
    public void mathsquiz (View view) {
        startActivity(new Intent(this, AddmathsQuiz.class));
    }

    public void mathsPastPapers (View view) {
        startActivity(new Intent(this,MathsPastPapers.class));
    }
}