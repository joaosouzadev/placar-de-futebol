package com.example.android.soccermetrics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int shotsA = 0;
    int shotsTargetA = 0;
    int cornerKicksA = 0;
    int foulsA = 0;
    int interceptionsA = 0;
    int subsA = 0;
    int shotsB = 0;
    int shotsTargetB = 0;
    int cornerKicksB = 0;
    int foulsB = 0;
    int interceptionsB = 0;
    int subsB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

/*
Method for Reset
 */

    public void resetScore(View view) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        shotsA = 0;
        shotsForTeamA(shotsA);
        shotsTargetA = 0;
        shotsOnTargetForTeamA(shotsTargetA);
        cornerKicksA = 0;
        cornerkicksForTeamA(cornerKicksA);
        foulsA = 0;
        foulsForTeamA(foulsA);
        interceptionsA = 0;
        interceptionsForTeamA(interceptionsA);
        subsA = 0;
        subsForTeamA(subsA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        shotsB = 0;
        shotsForTeamB(shotsB);
        shotsTargetB = 0;
        shotsOnTargetForTeamB(shotsTargetB);
        cornerKicksB = 0;
        cornerkicksForTeamB(cornerKicksB);
        foulsB = 0;
        foulsForTeamB(foulsB);
        interceptionsB = 0;
        interceptionsForTeamB(interceptionsB);
        subsB = 0;
        subsForTeamB(subsB);
    }

/*
Methods for Display on Screen
*/

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void shotsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shots_team_a);
        scoreView.setText(String.valueOf(score));
    }

    public void shotsOnTargetForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shotsontargetA);
        scoreView.setText(String.valueOf(score));
    }

    public void cornerkicksForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cornerkicksA);
        scoreView.setText(String.valueOf(score));
    }

    public void foulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulsA);
        scoreView.setText(String.valueOf(score));
    }

    public void interceptionsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.interceptionsA);
        scoreView.setText(String.valueOf(score));
    }

    public void subsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.substitutionsA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void shotsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shotsB);
        scoreView.setText(String.valueOf(score));
    }

    public void shotsOnTargetForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shotsontargetB);
        scoreView.setText(String.valueOf(score));
    }

    public void cornerkicksForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cornerkicksB);
        scoreView.setText(String.valueOf(score));
    }

    public void foulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulsB);
        scoreView.setText(String.valueOf(score));
    }

    public void interceptionsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.interceptionsB);
        scoreView.setText(String.valueOf(score));
    }

    public void subsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.substitutionsB);
        scoreView.setText(String.valueOf(score));
    }


/*
Methods for updating the numbers
 */

    public void goalA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void shotsAadd(View view) {
        shotsA = shotsA + 1;
        shotsForTeamA(shotsA);
    }

    public void shotsAminus(View view) {
        shotsA = shotsA - 1;
        shotsForTeamA(shotsA);
    }

    public void ShotsTargetA(View view) {
        shotsTargetA = shotsTargetA + 1;
        shotsOnTargetForTeamA(shotsTargetA);
        shotsA = shotsA + 1;
        shotsForTeamA(shotsA);
    }

    public void shotsTargetAminus(View view) {
        shotsTargetA = shotsTargetA - 1;
        shotsOnTargetForTeamA(shotsTargetA);
        shotsA = shotsA - 1;
        shotsForTeamA(shotsA);
    }

    public void cornerKicksA(View view) {
        cornerKicksA = cornerKicksA + 1;
        cornerkicksForTeamA(cornerKicksA);
    }

    public void cornerKicksAminus(View view) {
        cornerKicksA = cornerKicksA - 1;
        cornerkicksForTeamA(cornerKicksA);
    }

    public void foulsA(View view) {
        foulsA = foulsA + 1;
        foulsForTeamA(foulsA);
    }

    public void foulsAminus(View view) {
        foulsA = foulsA - 1;
        foulsForTeamA(foulsA);
    }

    public void interceptionsA(View view) {
        interceptionsA = interceptionsA + 1;
        interceptionsForTeamA(interceptionsA);
    }

    public void interceptionsAminus(View view) {
        interceptionsA = interceptionsA - 1;
        interceptionsForTeamA(interceptionsA);
    }

    public void subsA(View view) {
        subsA = subsA + 1;
        subsForTeamA(subsA);
    }

    public void subsAminus(View view) {
        subsA = subsA - 1;
        subsForTeamA(subsA);
    }

    public void goalB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void shotsBadd(View view) {
        shotsB = shotsB + 1;
        shotsForTeamB(shotsB);
    }

    public void shotsBminus(View view) {
        shotsB = shotsB - 1;
        shotsForTeamB(shotsB);
    }

    public void shotsTargetB(View view) {
        shotsTargetB = shotsTargetB + 1;
        shotsOnTargetForTeamB(shotsTargetB);
        shotsB = shotsB + 1;
        shotsForTeamB(shotsB);
    }

    public void shotsTargetBminus(View view) {
        shotsTargetB = shotsTargetB - 1;
        shotsOnTargetForTeamB(shotsTargetB);
        shotsB = shotsB - 1;
        shotsForTeamB(shotsB);
    }

    public void cornerKicksB(View view) {
        cornerKicksB = cornerKicksB + 1;
        cornerkicksForTeamB(cornerKicksB);
    }

    public void cornerKicksBminus(View view) {
        cornerKicksB = cornerKicksB - 1;
        cornerkicksForTeamB(cornerKicksB);
    }

    public void foulsB(View view) {
        foulsB = foulsB + 1;
        foulsForTeamB(foulsB);
    }

    public void foulsBminus(View view) {
        foulsB = foulsB - 1;
        foulsForTeamB(foulsB);
    }

    public void interceptionsB(View view) {
        interceptionsB = interceptionsB + 1;
        interceptionsForTeamB(interceptionsB);
    }

    public void interceptionsBminus(View view) {
        interceptionsB = interceptionsB - 1;
        interceptionsForTeamB(interceptionsB);
    }

    public void subsB(View view) {
        subsB = subsB + 1;
        subsForTeamB(subsB);
    }

    public void subsBminus(View view) {
        subsB = subsB - 1;
        subsForTeamB(subsB);
    }


}