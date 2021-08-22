package com.lglf77.quizapp02.LocalScoreBoard;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.lglf77.quizapp02.DbHelper.DbHelper;
import com.lglf77.quizapp02.R;

public class ScoreLevelFinal extends AppCompatActivity {
    DbHelper dbHelper = new DbHelper(this);
    TextView s1;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorelevelfinal);

        setTitle("Finale Score");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        s1 = (TextView)findViewById(R.id.st);

        int finalScore = 0;
        finalScore = dbHelper.getScoreRandom();

        if(finalScore < 10) {
            s1.setText("0" + finalScore);
        } else {
            s1.setText("" + finalScore);
        }

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
