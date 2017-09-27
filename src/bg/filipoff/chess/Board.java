package bg.filipoff.chess;

import bg.filipoff.chess.Constants.Color;

public class Board {

	private Field[][] board;

	public Board() {

		Color c = Color.BLACK;

		board = new Field[Constants.BOARD_LENGTH][Constants.BOARD_WIDTH];

		for (int i = 0; i < Constants.BOARD_LENGTH; i++) {
			for (int j = 0; j < Constants.BOARD_WIDTH; j++) {

				board[i][j] = new Field(this, c, i, j);

				c = c.toggle();
			}

			c = c.toggle();
		}
	}

	public void print() {

		for (int i = 0; i < Constants.BOARD_LENGTH; i++) {
			for (int j = 0; j < Constants.BOARD_WIDTH; j++) {
				System.out.print("[" + board[i][j].getPosition() + "]");
			}
			System.out.print("\n");
		}
	}

	public Field getFieldAt(int row, int column) {
		if (row < 0 || row >= Constants.BOARD_LENGTH || column < 0
				|| column >= Constants.BOARD_WIDTH)
			// TODO:
			// null or exception ??
			return null;
		
		return board[row][column];
	}
}
