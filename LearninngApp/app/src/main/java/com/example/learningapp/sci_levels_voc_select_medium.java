package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class sci_levels_voc_select_medium extends AppCompatActivity {
    LinearLayout l1;
    LinearLayout l2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci_levels_voc_select_medium);

        l1=(LinearLayout) findViewById(R.id.l1);

        l2=(LinearLayout) findViewById(R.id.l2);



        l1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_levels_voc_select_medium.this,sci_voc_biosphere_sinhala.class);
                startActivity(intent);
            }
        } );

        l2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_levels_voc_select_medium.this,sci_voc_biosphere_tamil.class);
                startActivity(intent);
            }
        } );





    }
}