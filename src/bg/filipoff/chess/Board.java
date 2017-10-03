package bg.filipoff.chess;

public class Board {

	private Field[][] board;

	public Board() {

		Constants.Color c = Constants.Color.BLACK;

		board = new Field[Constants.BOARD_LENGTH][Constants.BOARD_WIDTH];

		for (int i = 0; i < Constants.BOARD_LENGTH; i++) {
			for (int j = 0; j < Constants.BOARD_WIDTH; j++) {

				board[i][j] = new Field(this, c, i, j);

				c = c.toggle();
			}

			c = c.toggle();
		}
	}

	// prints the positions of the field on the board
	public void print() {

		for (int i = Constants.BOARD_LENGTH - 1; i >= 0; i--) {
			for (int j = 0; j < Constants.BOARD_WIDTH; j++) {
				System.out.print("[" + board[i][j].getPosition() + "]");
			}
			System.out.print("\n");
		}
	}

	// prints the positions of the field on the board
	// as black player sees it

	public void printFlipped() {
		for (int i = 0; i < Constants.BOARD_LENGTH; i++) {
			for (int j = Constants.BOARD_WIDTH - 1; j >= 0; j--) {
				System.out.print("[" + board[i][j].getPosition() + "]");
			}
			System.out.print("\n");
		}
	}

	// returns the field by row and column
	// or null if arguments are not valid

	public Field getFieldAt(int row, int column) {
		if (row < 0 || row >= Constants.BOARD_LENGTH || column < 0
				|| column >= Constants.BOARD_WIDTH)
			// TODO:
			// null or exception ??

			return null;

		return board[row][column];
	}

	// returns the field by board notation i.e "A1", "H8"
	// or null if arguments are not valid
	public Field getFieldAt(String boardNotation) {

		if (boardNotation.length() != 2)
			return null;

		// TODO : better way?
		// how can row and column be visible outside the 'try' block ?
		try {

			boardNotation = boardNotation.toUpperCase();

			char parseColumn = boardNotation.charAt(0);

			// Not scalable enough
			// its hardcoded

			if (parseColumn < 'A' || parseColumn > 'H')
				throw new NumberFormatException();

			char base = 'A';

			int column = parseColumn - base;

			int row = Integer.parseInt("" + boardNotation.charAt(1)) - 1;

			if (row < 0 || row >= Constants.BOARD_LENGTH || column < 0
					|| column >= Constants.BOARD_WIDTH)
				// TODO:
				// null or exception ??
				return null;

			return board[row][column];

		} catch (NumberFormatException ex) {
			return null;
		}
	}
}
