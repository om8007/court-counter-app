package com.mycompany.courtcounter;

import android.app.*;
import android.os.*;
import android.widget.TextView;
import android.view.View;
import android.graphics.Color;

public class MainActivity extends Activity 
{
	int scoreTeamA=0;
	int scoreTeamB=0;
	TextView scoreViewA;
	TextView scoreViewB;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		scoreViewA = (TextView) findViewById(R.id.team_a_score);
		scoreViewB = (TextView) findViewById(R.id.team_b_score);
    }
	
	/**
	 * Increase the score for Team A by 1 point.
	 */
	public void addOneForTeamA(View v) {
		scoreTeamA = scoreTeamA +1;
		displayForTeamA(scoreTeamA);
	}

	/**
	 * Increase the score for Team A by 2 points.
	 */
	public void addTwoForTeamA(View v) {
		scoreTeamA = scoreTeamA +2;
		displayForTeamA(scoreTeamA);
	}

	/**
	 * Increase the score for Team A by 3 points.
	 */
	public void addThreeForTeamA(View v) {
		scoreTeamA = scoreTeamA +3;
		displayForTeamA(scoreTeamA);
	}
	/**
	 * Displays the given score for Team A.
	 */
	public void displayForTeamA(int score) {
		scoreViewA.setText(String.valueOf(score));
		greenScore();
	}
	/**
	 * Increase the score for Team A by 1 point.
	 */
	public void addOneForTeamB(View v) {
		scoreTeamB = scoreTeamB +1;
		displayForTeamB(scoreTeamB);
	}

	/**
	 * Increase the score for Team A by 2 points.
	 */
	public void addTwoForTeamB(View v) {
		scoreTeamB = scoreTeamB +2;
		displayForTeamB(scoreTeamB);
	}

	/**
	 * Increase the score for Team A by 3 points.
	 */
	public void addThreeForTeamB(View v) {
		scoreTeamB = scoreTeamB +3;
		displayForTeamB(scoreTeamB);
	}
	/**
	 * Displays the given score for Team A.
	 */
	public void displayForTeamB(int score) {
		scoreViewB.setText(String.valueOf(score));
		greenScore();
	}
	
	/**
	* Resets the score of both teams
	*/
	public void resetScore(View v){
		scoreTeamA=0;
		scoreTeamB=0;
		displayForTeamA(scoreTeamA);
		displayForTeamB(scoreTeamB);
		scoreViewA.setTextColor(Color.parseColor("#000000"));
		scoreViewB.setTextColor(Color.parseColor("#000000"));
		
	}

	/**
	* colors green the winning team score
	*/
	public void greenScore()
	{ if(scoreTeamA > scoreTeamB)
	    {  scoreViewA.setTextColor(Color.parseColor("#05AC0F"));
		   scoreViewB.setTextColor(Color.parseColor("#000000"));
	     }
	  else if(scoreTeamB > scoreTeamA)
		{  scoreViewB.setTextColor(Color.parseColor("#05AC0F")); 
		   scoreViewA.setTextColor(Color.parseColor("#000000"));}
	 else if(scoreTeamA>0 && scoreTeamA == scoreTeamB)
	 {
		 scoreViewA.setTextColor(Color.parseColor("#264B96"));
		 scoreViewB.setTextColor(Color.parseColor("#264B96"));
	 }
	}  
}
