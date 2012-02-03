package com.brian.andtactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class splash extends Activity {
	
	//global stuff
	
	TextView tv;
	//main stuff
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button b1 = (Button) findViewById(R.id.button1);
		Button b2 = (Button) findViewById(R.id.button2);
		
		

		b1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				gamemode(1);
			}
		});

		b2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				gamemode(0);
			}
		});
	}
	
	//of activity block
	

	
	
	
	//gamemode begins
	
	public void gamemode(int mode) {
		Intent go = new Intent(this, rungame.class);
		go.putExtra("gamemode", mode);
		startActivity(go);
		finish();
	}

	//sets up/launch menu
	
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater openmen = getMenuInflater();
		openmen.inflate(R.menu.abtmenu, menu);
		return true;
	}
	
	//menu input and actions
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()) {
			case R.id.about1:
				Intent abt = new Intent(this, about.class);
				startActivity(abt);
			
		}
		return false;
	}



}