package com.brian.andtactoe;

//this does all the game logic, scoring and ai
public class board {

	// sets up the array for the borad and a counter for the player turn
	String[][] brd = new String[3][3];
	int counter = 0;

	// sets data X or O
	public void setdata(int turn, int row, int col) {
		if (turn == 1) {
			brd[row][col] = "X";
		} else {
			brd[row][col] = "O";
		}
		counter++;
	}

	// called to make a cpu move. returns a list
	public int[] cpumove(int ailvl) {
		String tmp;
		for (int i = 0; i < 2; i++) {
			if (i == 1) {
				tmp = "X";
			} else {
				tmp = "O";
			}

			if (ailvl >= 2) {

				if (((brd[0][0] == tmp) && brd[0][0] == brd[0][1])
						&& brd[0][2] == null) {
					int[] a = { 0, 2 };
					counter++;
					return a;
				} else if (((brd[0][1] == tmp) && brd[0][1] == brd[0][2])
						&& brd[0][0] == null) {
					int[] a = { 0, 0 };
					counter++;
					return a;
				} else if (((brd[0][0] == tmp) && brd[0][0] == brd[0][2])
						&& brd[0][1] == null) {
					int[] a = { 0, 1 };
					counter++;
					return a;// mark #######################################
				} else if (((brd[1][0] == tmp) && brd[1][0] == brd[1][1])
						&& brd[1][2] == null) {
					int[] a = { 1, 2 };
					counter++;
					return a;
				} else if (((brd[1][1] == tmp) && brd[1][1] == brd[1][2])
						&& brd[1][0] == null) {
					int[] a = { 1, 0 };
					counter++;
					return a;
				} else if (((brd[1][0] == tmp) && brd[1][0] == brd[1][2])
						&& brd[1][1] == null) {
					int[] a = { 1, 1 };
					counter++;
					return a;// mark #######################################
				} else if (((brd[2][0] == tmp) && brd[2][0] == brd[2][1])
						&& brd[2][2] == null) {
					int[] a = { 2, 2 };
					counter++;
					return a;
				} else if (((brd[2][1] == tmp) && brd[2][1] == brd[2][2])
						&& brd[2][0] == null) {
					int[] a = { 2, 0 };
					counter++;
					return a;
				} else if (((brd[2][0] == tmp) && brd[2][0] == brd[2][2])
						&& brd[2][1] == null) {
					int[] a = { 2, 1 };
					counter++;
					return a;// mark #######################################
				} else if (((brd[0][0] == tmp) && brd[0][0] == brd[1][0])
						&& brd[2][0] == null) {
					int[] a = { 2, 0 };
					counter++;
					return a;
				} else if (((brd[1][0] == tmp) && brd[1][0] == brd[2][0])
						&& brd[0][0] == null) {
					int[] a = { 0, 0 };
					counter++;
					return a;
				} else if (((brd[0][0] == tmp) && brd[0][0] == brd[2][0])
						&& brd[1][0] == null) {
					int[] a = { 1, 0 };
					counter++;
					return a;// mark #######################################
				} else if (((brd[0][1] == tmp) && brd[0][1] == brd[1][1])
						&& brd[2][1] == null) {
					int[] a = { 2, 1 };
					counter++;
					return a;
				} else if (((brd[1][1] == tmp) && brd[1][1] == brd[2][1])
						&& brd[0][1] == null) {
					int[] a = { 0, 1 };
					counter++;
					return a;
				} else if (((brd[0][1] == tmp) && brd[0][1] == brd[2][1])
						&& brd[1][1] == null) {
					int[] a = { 1, 1 };
					counter++;
					return a;// mark #######################################
				} else if (((brd[0][2] == tmp) && brd[0][2] == brd[1][2])
						&& brd[2][2] == null) {
					int[] a = { 2, 2 };
					counter++;
					return a;
				} else if (((brd[1][2] == tmp) && brd[1][2] == brd[2][2])
						&& brd[0][2] == null) {
					int[] a = { 0, 2 };
					counter++;
					return a;
				} else if (((brd[0][2] == tmp) && brd[0][2] == brd[2][2])
						&& brd[1][2] == null) {
					int[] a = { 1, 2 };
					counter++;
					return a;// mark #######################################
				} else if (((brd[0][0] == tmp) && brd[0][0] == brd[1][1])
						&& brd[2][2] == null) {
					int[] a = { 2, 2 };
					counter++;
					return a;
				} else if (((brd[1][1] == tmp) && brd[1][1] == brd[2][2])
						&& brd[0][0] == null) {
					int[] a = { 0, 0 };
					counter++;
					return a;
				} else if (((brd[0][0] == tmp) && brd[0][0] == brd[2][2])
						&& brd[1][1] == null) {
					int[] a = { 1, 1 };
					counter++;
					return a;// mark #######################################
				} else if (((brd[0][2] == tmp) && brd[0][2] == brd[1][1])
						&& brd[2][0] == null) {
					int[] a = { 2, 0 };
					counter++;
					return a;
				} else if (((brd[2][0] == tmp) && brd[2][0] == brd[1][1])
						&& brd[0][2] == null) {
					int[] a = { 0, 2 };
					counter++;
					return a;
				} else if (((brd[2][0] == tmp) && brd[2][0] == brd[0][2])
						&& brd[1][1] == null) {
					int[] a = { 1, 1 };
					counter++;
					return a;// mark #######################################
				}
			}
		}

		if (ailvl >= 1 && brd[1][1] == null) {
			int[] a = { 1, 1 };
			counter++;
			return a;

		} else {
			if (ailvl >= 1 && brd[0][0] == null) {
				int[] a = { 0, 0 };
				counter++;
				return a;
			} else if (ailvl >= 1 && brd[2][0] == null) {
				int[] a = { 2, 0 };
				counter++;
				return a;
			} else if (ailvl >= 1 && brd[0][2] == null) {
				int[] a = { 0, 2 };
				counter++;
				return a;
			} else if (ailvl >= 1 && brd[2][2] == null) {
				int[] a = { 2, 2 };
				counter++;
				return a;
			} else {

				if (ailvl >= 0) {
					for (int q = 0; q < brd.length; q++) {
						for (int x = 0; x < brd.length; x++) {
							if (brd[x][q] == null) {
								int[] a = { x, q };
								counter++;
								return a;
							}
						}
					}
				}
			}
		}

		counter++;
		int[] a = { 3, 3 };
		return a;
	}

	// gets the current player turn. (this is what that counter is for :P )
	public int getturn() {
		if (counter % 2 == 0) {
			return 1;
		} else {
			return 2;
		}
	}

	// reutrns one piece of data from the board array
	public String getdata(int row, int col) {
		return brd[col][row];
	}

	// checks if the board is full
	public boolean full() {
		boolean temp = true;
		for (int i = 0; i < brd.length; i++) {
			for (int j = 0; j < brd.length; j++) {
				if (brd[i][j] == null) {
					temp = false;
				}
			}
		}
		if (temp == true) {
			return true;
		} else {
			return false;
		}
	}

	// checks to see if the game is doen and who won
	public int isdone() {
		if ((brd[0][0] == "X" || brd[0][0] == "O") && brd[0][0] == brd[0][1]
				&& brd[0][0] == brd[0][2]) {
			return 1;
		} else if ((brd[1][0] == "X" || brd[1][0] == "O")
				&& brd[1][0] == brd[1][1] && brd[1][0] == brd[1][2]) {
			return 2;
		} else if ((brd[2][0] == "X" || brd[2][0] == "O")
				&& brd[2][0] == brd[2][1] && brd[2][0] == brd[2][2]) {
			return 3;
		} else if ((brd[0][0] == "X" || brd[0][0] == "O")
				&& brd[0][0] == brd[1][0] && brd[0][0] == brd[2][0]) {
			return 4;
		} else if ((brd[0][1] == "X" || brd[0][1] == "O")
				&& brd[0][1] == brd[1][1] && brd[1][1] == brd[2][1]) {
			return 5;
		} else if ((brd[0][2] == "X" || brd[0][2] == "O")
				&& brd[0][2] == brd[1][2] && brd[0][2] == brd[2][2]) {
			return 6;
		} else if ((brd[0][0] == "X" || brd[0][0] == "O")
				&& brd[0][0] == brd[1][1] && brd[0][0] == brd[2][2]) {
			return 7;
		} else if ((brd[2][0] == "X" || brd[2][0] == "O")
				&& brd[2][0] == brd[1][1] && brd[2][0] == brd[0][2]) {
			return 8;
		} else {
			return 0;
		}
	}

}
