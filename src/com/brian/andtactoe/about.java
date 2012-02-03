package com.brian.andtactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class about extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
		TextView tvabt = (TextView)findViewById(R.id.textabout);
		
		tvabt.setText("And-Tac-Toe \n A simple tic tac toe game for android. \n BUGS? \n private message user gh123man at xda-developers.com \n \n :D");
		
		tvabt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				
			}
		});
		
		
		
		
	}

}
