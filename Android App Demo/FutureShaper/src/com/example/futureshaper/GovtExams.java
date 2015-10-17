package com.example.futureshaper;

import java.nio.channels.SelectableChannel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class GovtExams extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.govt_exams);
		Button cetk = (Button) findViewById(R.id.cetkButt);
		Button aieee = (Button) findViewById(R.id.aieeeButt);
		Button iit = (Button) findViewById(R.id.iitButt);
		
		cetk.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent cetinfo = new Intent(GovtExams.this, CetDetails.class);
				startActivity(cetinfo);
			}
		});
		
	}
}
