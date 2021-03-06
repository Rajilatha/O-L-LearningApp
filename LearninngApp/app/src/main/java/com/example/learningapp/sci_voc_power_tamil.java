package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class sci_voc_power_tamil extends AppCompatActivity {

    private List<word> questionList;
    private int questionCounter;
    private int questionCountTotal;
    private word currentQuestion;

    Button btnend;
    TextView txt_lesson;
    int r=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci_voc_power_tamil);
        btnend = (Button) findViewById(R.id.btnend);
        txt_lesson = (TextView) findViewById(R.id.powertam);

        DbHelper dbHelper = new DbHelper(this);
        questionList = dbHelper.getAllPowertamil();
        questionCountTotal = questionList.size();


        showNextQuestion();



        btnend.setOnClickListener(new View.OnClickListener() {
            int i=1;

            @Override
            public void onClick(View v) {

                // imageButtonOne.setVisibility(View.VISIBLE);

                i++;
                r++;
                if (i==2) {
                    Intent intent=new Intent(sci_voc_power_tamil.this,sci_tissues_chapters.class);
                    startActivity(intent);
                }
                showNextQuestion();


            }


        });

    }


    public void showNextQuestion() {
        if (questionCounter < questionCountTotal) {
            currentQuestion = questionList.get(questionCounter);

            txt_lesson.setText(currentQuestion.getName());

            questionCounter++;

        }
    }
}


