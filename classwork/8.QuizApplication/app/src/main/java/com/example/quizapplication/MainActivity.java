package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private QuesionLibrary quesionLibrary = new QuesionLibrary();
    private TextView mScoreView;
    private TextView mQuesView;
    private Button mBtnChoice1;
    private Button mBtnChoice2;
    private Button mBtnChoice3;
    private Button mBtnQuit;

    private String mAnswer;
    private Integer mScore = 0;
    private Integer mQuesNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreView = (TextView) findViewById(R.id.tvScore);
        mQuesView = (TextView) findViewById(R.id.tvQues);
        mBtnChoice1 = findViewById(R.id.btnChoice1);
        mBtnChoice2 = findViewById(R.id.btnChoice2);
        mBtnChoice3 = findViewById(R.id.btnChoice3);
        mBtnQuit = findViewById(R.id.btnQuit);

        mBtnChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (mBtnChoice1.getText() == mAnswer) {
                        mScore=mScore+1;
                        updateQues();
                        updateScore(mScore);
                        Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "WA", Toast.LENGTH_SHORT).show();
                        updateQues();
                    }
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void updateQues() {
        mQuesView.setText(quesionLibrary.getQuestion(mQuesNumber));
        mBtnChoice1.setText(quesionLibrary.getChoice1(mQuesNumber));
        mBtnChoice1.setText(quesionLibrary.getChoice2(mQuesNumber));
        mBtnChoice1.setText(quesionLibrary.getChoice3(mQuesNumber));
        mAnswer = quesionLibrary.getCorrectAnswer(mQuesNumber);
    }

    public void updateScore(int point) {
        mScoreView.setText("Score: " + point);
    }
}