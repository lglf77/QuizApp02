package com.lglf77.quizapp02.LeaderBoard.Finale;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.lglf77.quizapp02.Adapter.LeaderBoardSecF;
import com.lglf77.quizapp02.Model.UserModel;
import com.lglf77.quizapp02.R;

import java.util.ArrayList;
import java.util.List;

public class LeaderBoardAcSecF extends AppCompatActivity {

    RecyclerView mUsersRecyclerView;
    private List<String> mUsersKeyList;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private DatabaseReference mUserRefDatabase;
    private ChildEventListener mChildEventListener;
    private LeaderBoardSecF leaderBoardAdapterSec1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader_board_ac_sec_f);

        mUsersRecyclerView=(RecyclerView)findViewById(R.id.recycler_view_users);
        setAuthInstance();
        setUsersDatabase();
        setUserRecyclerView();
        setUsersKeyList();
        setAuthListener();
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void setAuthInstance() {
        mAuth = FirebaseAuth.getInstance();
    }

    private void setUsersDatabase() {
        mUserRefDatabase = FirebaseDatabase.getInstance().getReference().child("users");
    }

    private void setUserRecyclerView() {
        leaderBoardAdapterSec1 = new LeaderBoardSecF(this, new ArrayList<UserModel>());
        mUsersRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mUsersRecyclerView.setHasFixedSize(true);
        //leaderBoardAdapterSec1.sortingScore();
        mUsersRecyclerView.setAdapter(leaderBoardAdapterSec1);
    }

    private void setUsersKeyList() {
        mUsersKeyList = new ArrayList<String>();
    }

    private void setAuthListener() {
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();

                if (user != null) {
                    queryAllUsers();
                } else {
                    Toast.makeText(LeaderBoardAcSecF.this,
                            "O usu??rio est?? desconectado", Toast.LENGTH_SHORT).show();
                    // User is signed out
                }
            }
        };
    }

    private void queryAllUsers() {
        clearCurrentUsers();
        mChildEventListener = getChildEventListener();
        mUserRefDatabase.limitToFirst(50).addChildEventListener(mChildEventListener);
    }

    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop() {
        super.onStop();

        clearCurrentUsers();
        if (mChildEventListener != null) {
            mUserRefDatabase.removeEventListener(mChildEventListener);
        }
    }

    private void clearCurrentUsers() {
        leaderBoardAdapterSec1.clear();
        mUsersKeyList.clear();
    }

    private ChildEventListener getChildEventListener() {
        return new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, String s) {

                if(dataSnapshot.exists()) {
                    String userUid = dataSnapshot.getKey();
                    if(dataSnapshot.hasChildren()) {
                        UserModel recipient = dataSnapshot.getValue(UserModel.class);
                        recipient.setRecipientId(userUid);
                        mUsersKeyList.add(userUid);
                        leaderBoardAdapterSec1.refill(recipient);
                    }
                }
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, String s) {
                if(dataSnapshot.exists()) {
                    String userUid = dataSnapshot.getKey();

                    UserModel user = dataSnapshot.getValue(UserModel.class);

                    int index = mUsersKeyList.indexOf(userUid);
                    if(index > -1) {
                        leaderBoardAdapterSec1.changeUser(index, user);
                    }
                }
            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}
