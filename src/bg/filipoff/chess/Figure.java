package bg.filipoff.chess;

import java.util.List;

public abstract class Figure {

	private Field field;
	private boolean isCaptured;
	
	
	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}

	public boolean isCaptured() {
		return isCaptured;
	}

	public void setCaptured(boolean isCaptured) {
		this.isCaptured = isCaptured;
	}

	public abstract List<Field> getPossibleMoves();

	public void capture(Figure other) {
	}
}
