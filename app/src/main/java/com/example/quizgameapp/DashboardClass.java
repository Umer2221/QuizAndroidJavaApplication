package com.example.quizgameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quizgameapp.LevelsofQuestions.LevelOneActivity;

public class DashboardClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_class);
    }

    public void levelzerobutton(View view) {
        startActivity(new Intent(DashboardClass.this, LevelOneActivity.class));

    }


}