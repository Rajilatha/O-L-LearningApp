package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class sci_hydrocarbons_chapters extends AppCompatActivity {
    LinearLayout l1;
    LinearLayout l2;
    LinearLayout voc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci_hydrocarbons_chapters);

        l1=(LinearLayout) findViewById(R.id.l1);

        l2=(LinearLayout) findViewById(R.id.l2);
        voc=(LinearLayout) findViewById(R.id.voc);



        l1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_hydrocarbons_chapters.this,sci_hydrocarbons_ethen.class);
                startActivity(intent);
            }
        } );

        l2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_hydrocarbons_chapters.this,sci_hydrocarbons_polymer.class);
                startActivity(intent);
            }
        } );
        voc.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_hydrocarbons_chapters.this,sci_ethen_voc_select_medium.class);
                startActivity(intent);
            }
        } );





    }
}