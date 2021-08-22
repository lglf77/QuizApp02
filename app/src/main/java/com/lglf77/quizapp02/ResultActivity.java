package com.lglf77.quizapp02;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.lglf77.quizapp02.DbHelper.DbHelper;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    int score = 0, scoreOS = 0, scoreCOMPFUNDA = 0, scoreHARDWARE = 0, scoreRandom = 0;
    DbHelper dbHelper = new DbHelper(this);
    Button btnWrongQstns;

    public ArrayList<String> wrongQuests = new ArrayList<String>();
    public ArrayList<String> selectedAnswers = new ArrayList<String>();
    public ArrayList<String> actualAnswers = new ArrayList<String>();

    String tableName = "",catName = "";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ImageView img = (ImageView) findViewById(R.id.imageView);
        btnWrongQstns = (Button) findViewById(R.id.btnWrongQstns);

        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate_around_center_point);
        rotate.setRepeatCount(1);
        img.startAnimation(rotate);

        // get text view
        TextView txtCorrectAns = (TextView) findViewById(R.id.txtCorrectAns);

        // get score
        final Bundle b = getIntent().getExtras();

        if (b.containsKey("scoreOS")) {
            scoreOS = b.getInt("scoreOS");
            tableName = b.getString("section");
            catName = b.getString("category");
            dbHelper.insertScoreOS(scoreOS,tableName,catName);
            score = scoreOS;
        } else if (b.containsKey("scoreCompFunda")) {
            scoreCOMPFUNDA = b.getInt("scoreCompFunda");
            tableName = b.getString("section");
            catName = b.getString("category");
            dbHelper.insertScoreCompFunda(scoreCOMPFUNDA,tableName,catName);
            score = scoreCOMPFUNDA;
        } else if (b.containsKey("scoreHardware")) {
            scoreHARDWARE = b.getInt("scoreHardware");
            tableName = b.getString("section");
            catName = b.getString("category");
            dbHelper.insertScoreHardware(scoreHARDWARE, tableName, catName);
            score = scoreHARDWARE;
        } else if (b.containsKey("scoreRandom")) {
            scoreRandom = b.getInt("scoreRandom");
            tableName = b.getString("section");
            dbHelper.insertScoreFinal(scoreRandom, tableName);
            score = scoreRandom;
        }

        txtCorrectAns.setText("Total Answered : 30" + "\n" + "Correct Answered : "
                + score + "\nWrong Answered : " + (30 - score));

        wrongQuests = getIntent().getStringArrayListExtra("wrongQuestions");
        selectedAnswers = getIntent().getStringArrayListExtra("selectedAnswer");
        actualAnswers = getIntent().getStringArrayListExtra("actualAnswer");

        double perc = score * 3.33;

        DecimalFormat df = new DecimalFormat("##.###");
        TextView tvPerc = (TextView) findViewById(R.id.tvPerc);
        tvPerc.setText("" + df.format(perc) +" %");

        btnWrongQstns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultActivity.this, WrongQuestion.class);
                // Bundle b = new Bundle();
                intent.putStringArrayListExtra("wrongQuestions", wrongQuests);
                intent.putStringArrayListExtra("selectedAnswer", selectedAnswers);
                intent.putStringArrayListExtra("actualAnswer", actualAnswers);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflar o menu; isso adiciona itens à barra de ação, se houver.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Lidar com os cliques do item da barra de ação aqui. A barra de ação irá
        // lida automaticamente com cliques no botão Home / Up, por muito tempo
        // conforme você especifica uma atividade pai em AndroidManifest.xml.
        int id = item.getItemId();

        // noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

}
