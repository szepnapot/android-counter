package com.example.android.footballscorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int goalA = 0;
    int goalB = 0;
    int yellowCardA = 0;
    int yellowCardB = 0;
    int redCardA = 0;
    int redCardB = 0;

    public void addGoal(View v){
        if (v.getTag().toString().equals("A")) {
            goalA++;
            displayGoalForTeamA();
        }
        else {
            goalB++;
            displayGoalForTeamB();
        }
    }
    public void addYellowCard(View v){
        if (v.getTag().toString().equals("A")) {
            yellowCardA++;
            displayYellowCardForA();
        }
        else {
            yellowCardB++;
            displayYellowCardForB();
        }
    }
    public void addRedCard(View v) {
        if (v.getTag().toString().equals("A")) {
            redCardA++;
            displayRedCardForA();
        } else {
            redCardB++;
            displayRedCardForB();
        }
    }

    public void resetScore(View v){
        goalA = 0;
        goalB = 0;
        yellowCardA = 0;
        yellowCardB = 0;
        redCardA = 0;
        redCardB = 0;

        displayGoalForTeamA();
        displayGoalForTeamB();
        displayYellowCardForA();
        displayYellowCardForB();
        displayRedCardForA();
        displayRedCardForB();
    }
    public void displayGoalForTeamA(){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(goalA));
    }
    public void displayYellowCardForA(){
        TextView scoreView = (TextView) findViewById(R.id.a_yellow_card_score);
        scoreView.setText(String.valueOf(yellowCardA));
    }
    public void displayRedCardForA(){
        TextView scoreView = (TextView) findViewById(R.id.a_red_card_score);
        scoreView.setText(String.valueOf(redCardA));
    }
    public void displayGoalForTeamB(){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(goalB));
    }
    public void displayYellowCardForB(){
        TextView scoreView = (TextView) findViewById(R.id.b_yellow_card_score);
        scoreView.setText(String.valueOf(yellowCardB));
    }
    public void displayRedCardForB(){
        TextView scoreView = (TextView) findViewById(R.id.b_red_card_score);
        scoreView.setText(String.valueOf(redCardB));
    }

}
