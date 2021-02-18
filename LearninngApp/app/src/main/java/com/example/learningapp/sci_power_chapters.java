package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class sci_power_chapters extends AppCompatActivity {
    LinearLayout l1;
    LinearLayout l2;
    LinearLayout voc;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci_power_chapters);

        l1=(LinearLayout) findViewById(R.id.l1);

        l2=(LinearLayout) findViewById(R.id.l2);
        voc=(LinearLayout) findViewById(R.id.voc);





        l1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_power_chapters.this,sci_power_appliences.class);
                startActivity(intent);
            }
        } );

        l2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_power_chapters.this,sci_power_circuits.class);
                startActivity(intent);
            }
        } );

        voc.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sci_power_chapters.this,sci_appliences_voc_select_medium.class);
                startActivity(intent);
            }
        } );







    }
}