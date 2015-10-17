package com.example.futureshaper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class UniversityCh extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.university_choice);
		Button govtBtn = (Button) findViewById(R.id.GovtButton);
		Button pvtBtn = (Button) findViewById(R.id.PvtButton);
		govtBtn.setOnClickListener(new ButtonClickListener());
		pvtBtn.setOnClickListener(new ButtonClickListener());
			}
	
	private class ButtonClickListener implements View.OnClickListener {

		@Override
		public void onClick(View v) {
			Log.d("FutureShaper", "One of the buttons was clicked");
			Intent uniSelectionIntent = new Intent();
			if (v.getId() == R.id.GovtButton) {
				uniSelectionIntent.setClass(UniversityCh.this, GovtExams.class);
			}
			else {
				
			}
			startActivity(uniSelectionIntent);
		}
		
	}
}
