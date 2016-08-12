package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Game Score
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     *  Adds 3 to the score team A
     */
    public void addThreeToTeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     *  Adds 2 to the score team A
     */
    public void addTwoToTeamA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     *  Adds 1 to the score team A
     */
    public void addOneToTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     *  Adds 3 to the score team B
     */
    public void addThreeToTeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     *  Adds 2 to the score team B
     */
    public void addTwoToTeamB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     *  Adds 1 to the score team B
     */
    public void addOneToTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets team A score and team B score. Then displays the new scores.
     */
    public void resetTeamScore(View view) {
        TextView scoreViewTeamA = (TextView) findViewById(R.id.team_a_score);
        TextView scoreViewTeamB = (TextView) findViewById(R.id.team_b_score);
        scoreTeamA = 0;
        scoreTeamB = 0;
        scoreViewTeamA.setText(String.valueOf(scoreTeamA));
        scoreViewTeamB.setText(String.valueOf(scoreTeamB));
    }
}
