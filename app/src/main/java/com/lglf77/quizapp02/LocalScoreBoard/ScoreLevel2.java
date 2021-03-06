package com.lglf77.quizapp02.LocalScoreBoard;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.lglf77.quizapp02.DbHelper.DbHelper;
import com.lglf77.quizapp02.R;

public class ScoreLevel2 extends AppCompatActivity {

    DbHelper dbHelper = new DbHelper(this);
    TextView s1,s2,s3;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorelevel2);

        setTitle("Operating System Score");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int osB,osI,osE;

        osB = osI = osE = 0;

        osB=dbHelper.getScoreOSB();
        osI=dbHelper.getScoreOSI();
        osE=dbHelper.getScoreOSE();

        s1=(TextView)findViewById(R.id.st1);
        s2=(TextView)findViewById(R.id.st2);
        s3=(TextView)findViewById(R.id.st3);

        if(osB<10) {
            s1.setText("0"+ osB);
        } else {
            s1.setText(""+ osB);
        }

        if(osI<10) {
            s2.setText("0"+ osI);
        } else {
            s2.setText(""+ osI);
        }

        if(osE<10) {
            s3.setText("0"+ osE);
        } else {
            s3.setText(""+ osE);
        }


    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}
