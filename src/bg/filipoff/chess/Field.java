package bg.filipoff.chess;

public class Field {

	class Position {

		private int row;

		private int column;

		public Position(int row, int column) {
			setRow(row);
			setColumn(column);
		}

		public int getRow() {
			return row;
		}

		public void setRow(int row) {
			if (row < 0 || row >= Constants.BOARD_LENGTH)
				throw new IllegalArgumentException("Invalid row position");

			this.row = row;
		}

		public int getColumn() {
			return column;
		}

		public void setColumn(int column) {
			if (column < 0 || column >= Constants.BOARD_WIDTH)
				throw new IllegalArgumentException("Invalid column position");
			this.column = column;
		}

		// Not scalable enough
		// What happens if we have more than 26 columns

		@Override
		public String toString() {

			char offset = 'A' - '0';
			char base = '0';

			return "" + (char) (column + offset + base)
					+ (char) (row + 1 + base);

		}
		// TODO:
		// implement equals method of Position

	}

	private Constants.Color color;
	private Position position;
	private Board board;

	public Field(Board board, Constants.Color color, int row, int column)
			throws IllegalArgumentException {

		this.color = color;
		this.position = new Position(row, column);
		this.board = board;

	}

	public Constants.Color getColor() {
		return color;
	}

	public Board getBoard() {
		return board;
	}

	public Position getPosition() {
		return position;
	}
}
