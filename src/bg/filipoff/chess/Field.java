package bg.filipoff.chess;

import bg.filipoff.chess.Constants;
import bg.filipoff.chess.Constants.Color;

public class Field {

	private class Position {

		private byte row;

		private byte column;

		public Position(byte row, byte column) {
			setRow(row);
			setColumn(column);
		}

		public byte getRow() {
			return row;
		}

		public void setRow(byte row) {
			if (row < 0 || row >= Constants.BOARD_LENGTH)
				throw new IllegalArgumentException("Invalid row position");

			this.row = row;
		}

		public byte getColumn() {
			return column;
		}

		public void setColumn(byte column) {
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
			
			return "" + (char) (column + offset + base) + (char) (row + 1 + base);
		}
		
		
	}

	private Constants.Color color;
	private Position position;
	
	
	public Field(Color color, byte row, byte column) throws IllegalArgumentException {
		
		this.color = color;
		this.position = new Position(row, column);
		
	}


	public Constants.Color getColor() {
		return color;
	}


	public Position getPosition() {
		return position;
	}	
}
