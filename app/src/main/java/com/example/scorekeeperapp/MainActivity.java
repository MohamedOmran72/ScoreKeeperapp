package com.example.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score, int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

        TextView foulsView = (TextView) findViewById(R.id.team_a_fouls);
        foulsView.setText(String.valueOf(fouls));
    }

    public void button_addGoalToTeamA(View view) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA, foulsTeamA);
    }

    public void button_addFoulOnTeamA(View view) {
        foulsTeamA++;
        displayForTeamA(scoreTeamA, foulsTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score, int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

        TextView foulsView = (TextView) findViewById(R.id.team_b_fouls);
        foulsView.setText(String.valueOf(fouls));
    }

    public void button_addFoulOnTeamB(View view) {
        foulsTeamB++;
        displayForTeamB(scoreTeamB, foulsTeamB);
    }

    public void button_addGoalToTeamB(View view) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB, foulsTeamB);
    }

    public void buttonReset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayForTeamB(scoreTeamB, foulsTeamB);
        displayForTeamA(scoreTeamA, foulsTeamA);
    }
}
