package com.example.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class sci_power_appliences extends AppCompatActivity {


    private List<word> questionList;
    private int questionCounter;
    private int questionCountTotal;
    private word currentQuestion;

    Button button_next;
    Button voc;
    TextView txt_lesson;
    int r=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci_power_appliences);
        txt_lesson = (TextView) findViewById(R.id.appliences);
        button_next = (Button) findViewById(R.id.button_next);

        DbHelper dbHelper = new DbHelper(this);
        questionList = dbHelper.getAllAppliences();
        questionCountTotal = questionList.size();

        showNextQuestion();


        button_next.setOnClickListener(new View.OnClickListener() {
            int i=1;

            @Override
            public void onClick(View v) {

                // imageButtonOne.setVisibility(View.VISIBLE);

                i++;
                r++;
                if (i==3) {
                    Intent intent=new Intent(sci_power_appliences.this,sci_power_chapters.class);
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


