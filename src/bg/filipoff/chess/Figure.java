package bg.filipoff.chess;

import java.util.List;

public abstract class Figure {

	private Field field;
	private boolean isCaptured;
	private Player owner;

	public Figure(Player owner, Field field) {
		this.owner = owner;
		this.field = field;
		this.isCaptured = false;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

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

	public abstract List<Field> getPossibleFieldsToMove();
}