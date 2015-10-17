package com.example.futureshaper;

import org.w3c.dom.Text;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class CetDetails extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cet_details);
		Button rankBtn = (Button) findViewById(R.id.rankBtn);
		Text rank = (Text) findViewById(R.id.rankEdit);
		Text branch = (Text) findViewById(R.id.branchEdit);
		Text category = (Text) findViewById(R.id.categoryEdit);
	}

}
