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

		// TODO: check if this is okay
		// what happens to the object after reference is lost
		// i.e
		// Bishop b = new Bishop(player, board.getFieldAt("d5"));
		this.owner.addFigureInPlay(this);
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