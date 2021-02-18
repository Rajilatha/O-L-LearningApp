package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class sci_mixtures_chapters extends AppCompatActivity {
    LinearLayout l1;
    LinearLayout l2;
    LinearLayout voc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci_mixtures_chapters);

        l1=(LinearLayout) findViewById(R.id.l1);

        l2=(LinearLayout) findViewById(R.id.l2);
        voc=(LinearLayout) findViewById(R.id.voc);



        l1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_mixtures_chapters.this,sci_mixtures_types.class);
                startActivity(intent);
            }
        } );

        l2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_mixtures_chapters.this,sci_mixtures_separation.class);
                startActivity(intent);
            }
        } );

        voc.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_mixtures_chapters.this,sci_types_voc_select_medium.class);
                startActivity(intent);
            }
        } );



    }
}