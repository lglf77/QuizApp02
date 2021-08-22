package com.lglf77.quizapp02;
// https://github.com/ssvas1997/Comp_Quiz_Android (PROJETO ORIGINAL
/*
ERRO NA CLASSE Db.Helper.java
Obs:
java.lang.RuntimeException: Unable to start activity ComponentInfo{com.lglf77
.quizapp/com.lglf77.quizapp.Main2ActivitySec1}: android.database.sqlite.SQLiteException:
near "WHERE": syntax error (code 1): , while compiling: SELECT * FROM  WHERE category = ''
 */
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    LinearLayout lfunda;
    LinearLayout os;
    LinearLayout hw;
    LinearLayout finale;
    LinearLayout sc;

    public FirebaseAuth.AuthStateListener mAuthListener;
    public String mCurrentUserUid;
    public FirebaseAuth mAuth;
    public DatabaseReference mUserRefDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setAuthListener();
        setAuthInstance();
        //setUsersDatabase();

        lfunda = (LinearLayout)findViewById(R.id.fundamentals);
        os = (LinearLayout)findViewById(R.id.operating);
        hw = (LinearLayout)findViewById(R.id.hardware);
        finale = (LinearLayout)findViewById(R.id.finale);
        sc = (LinearLayout)findViewById(R.id.score);

        lfunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Activity_Levels1.class);
                i.putExtra("table_name","questCompFunda");

                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);

            }
        });

        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Activity_Levels2.class);
                i.putExtra("table_name","questOS");
                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            }
        });

        hw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Activity_Levels3.class);
                i.putExtra("table_name","questHardware");
                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            }
        });

        finale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Info.class);
                i.putExtra("table_name","questFinal");
                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            }
        });

        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Activity_LevelScore.class);
                //i.putExtra("table_name","questOS");
                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            }
        });
    }

    public void setAuthInstance() {
        mAuth = FirebaseAuth.getInstance();
    }

    public void setAuthListener() {
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                FirebaseUser user = firebaseAuth.getCurrentUser();

                if (user != null) {
                    setUserData(user);
                    getIntent();
                } else {
                    // User is signed out
                    goToLogin();
                }
            }
        };
    }

    public void setUserData(FirebaseUser user) {
        mCurrentUserUid = user.getUid();
    }
    public void setUsersDatabase() {
        mUserRefDatabase = FirebaseDatabase.getInstance().getReference().child("users");
    }

    private void goToLogin() {
        Intent intent = new Intent(this, Activity_Login.class);

        // LoginActivity é uma nova tarefa
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        // A velha tarefa ao voltar para esta atividade deve ser eliminada para que não possamos voltar a ela.
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    protected void onResume(){
        super.onResume();
        // startActivity(new Intent(getIntent()));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Infle o menu; isso adiciona itens à barra de ação, se houver.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Lidar com os cliques do item da barra de ação aqui. A barra de ação irá
        // lida automaticamente com cliques no botão Home / Up, por muito tempo
        // conforme você especifica uma atividade pai em AndroidManifest.xml.

        if(item.getItemId()==R.id.action_logout){
            logout();
            return true;
        }
        // noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }
    private void logout() {
        mAuth.signOut();
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Remova o comentário do código abaixo para definir a mensagem e o título do arquivo strings.xml
        // builder.setMessage(R.string.dialog_message) .setTitle(R.string.dialog_title);

        // Configurando a mensagem manualmente e executando a ação ao clicar no botão
        builder.setMessage("Do you want to close this app?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Ação para o botão 'NÃO'
                        dialog.cancel();
                    }
                });

        // Criando caixa de diálogo
        AlertDialog alert = builder.create();
        // Configurando o título manualmente
        // alert.setTitle("CompQuiz");
        alert.show();
    }
}
