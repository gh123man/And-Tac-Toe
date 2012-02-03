package com.brian.andtactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class rungame extends Activity {
	Bundle extras;

	TextView b1;
	TextView b2;
	TextView b3;
	TextView b4;
	TextView b5;
	TextView b6;
	TextView b7;
	TextView b8;
	TextView b9;
	TextView b10;
	ImageView im;
	
	board brd = new board();

	

	public void reset() {
		Intent i = new Intent(this, splash.class);
		finish();
		startActivity(i);
	}

	public String out() {
		String temp;
		String turn;
		if (brd.getturn() == 1) {
			turn = "X";
		} else {
			turn = "O";
		}
		if (brd.isdone() != 0) {
			switch (brd.isdone()) {
			case 1:
				im.setImageResource(R.drawable.pos1);
				break;
			case 2:
				im.setImageResource(R.drawable.pos2);
				break;
			case 3:
				im.setImageResource(R.drawable.pos3);
				break;
			case 4:
				im.setImageResource(R.drawable.pos4);
				break;
			case 5:
				im.setImageResource(R.drawable.pos5);
				break;
			case 6:
				im.setImageResource(R.drawable.pos6);
				break;
			case 7:
				im.setImageResource(R.drawable.pos7);
				break;
			case 8:
				im.setImageResource(R.drawable.pos8);
				break;

			}
			if (turn == "X") {
				temp = "O" + " WINS!";
			} else {
				temp = "X" + " WINS!";
			}
				
			
		} else if (brd.full() == true && brd.isdone() == 0) {
			temp = "Game is a draw";
		} else {
			temp = "Its " + turn + "'s turn";
		}
		return temp;
	}

	public int gamemode() {
		if (extras != null) {
			int mode = extras.getInt("gamemode");
			return mode;
		} else {
			return 0;
		}
	}

	public void btnmove(int row, int col) {
		if (row == 0 && col == 0) {
			b1.setText(brd.getdata(row, col));
		}
		if (row == 1 && col == 0) {
			b2.setText(brd.getdata(row, col));
		}
		if (row == 2 && col == 0) {
			b3.setText(brd.getdata(row, col));
		}
		if (row == 0 && col == 1) {
			b4.setText(brd.getdata(row, col));
		}
		if (row == 1 && col == 1) {
			b5.setText(brd.getdata(row, col));
		}
		if (row == 2 && col == 1) {
			b6.setText(brd.getdata(row, col));
		}
		if (row == 0 && col == 2) {
			b7.setText(brd.getdata(row, col));
		}
		if (row == 1 && col == 2) {
			b8.setText(brd.getdata(row, col));
		}
		if (row == 2 && col == 2) {
			b9.setText(brd.getdata(row, col));
		}
	}

	public void dostuff(int row, int col) {
		if (brd.getdata(row, col) == null) {
			if (gamemode() == 0) {
				if (brd.isdone() == 0) {
					brd.setdata(brd.getturn(), col, row);
					btnmove(row, col);
					if (brd.isdone() == 0) {
						row = brd.cpumove(3)[0];
						col = brd.cpumove(3)[1];
						if (row == 3 || col == 3) {
							b10.setText(out());
						} else {
							brd.setdata(brd.getturn(), row, col);
							btnmove(col, row);
						}
					}

					b10.setText(out());
				}

			} else {
				if (brd.isdone() == 0) {
					brd.setdata(brd.getturn(), col, row);
					btnmove(row, col);
					b10.setText(out());
				}
			}
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game);

		extras = getIntent().getExtras();
		
		b1 = (TextView) findViewById(R.id.textView1);
		b2 = (TextView) findViewById(R.id.textView2);
		b3 = (TextView) findViewById(R.id.textView3);
		b4 = (TextView) findViewById(R.id.textView4);
		b5 = (TextView) findViewById(R.id.textView5);
		b6 = (TextView) findViewById(R.id.textView6);
		b7 = (TextView) findViewById(R.id.textView7);
		b8 = (TextView) findViewById(R.id.textView8);
		b9 = (TextView) findViewById(R.id.textView9);
		b10 = (TextView) findViewById(R.id.textView10);
		im = (ImageView) findViewById(R.id.imageView1);
		

		b10.setText(out());

		b1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int row = 0;
				int col = 0;
				dostuff(row, col);

			}
		});

		b2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int row = 1;
				int col = 0;
				dostuff(row, col);
			}
		});

		b3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int row = 2;
				int col = 0;
				dostuff(row, col);
			}
		});

		b4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int row = 0;
				int col = 1;
				dostuff(row, col);
			}
		});

		b5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int row = 1;
				int col = 1;
				dostuff(row, col);
			}
		});

		b6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int row = 2;
				int col = 1;
				dostuff(row, col);
			}
		});

		b7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int row = 0;
				int col = 2;
				dostuff(row, col);
			}
		});

		b8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int row = 1;
				int col = 2;
				dostuff(row, col);
			}
		});

		b9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int row = 2;
				int col = 2;
				dostuff(row, col);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuInflater openmen = getMenuInflater();
		openmen.inflate(R.menu.resetmen, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()) {
			case R.id.reset:
				reset();
				break;
			case R.id.about:
				Intent abt = new Intent(this, about.class);
				startActivity(abt);
			
		}
		return false;
	}
	
}
