package bg.filipoff.chess;

import java.util.LinkedList;
import java.util.List;

import bg.filipoff.chess.Constants.Color;

public class Player {

	private Color color;
	private boolean isInCheck;
	private List<Figure> figuresInPlay;

	public Player(Color color) {
		this.figuresInPlay = new LinkedList<Figure>();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public boolean isInCheck() {
		return isInCheck;
	}

	public void setInCheck(boolean isInCheck) {
		this.isInCheck = isInCheck;
	}

	public List<Figure> getFiguresInPlay() {
		return figuresInPlay;
	}

	public void addFigureInPlay(Figure figure) {
		this.figuresInPlay.add(figure);
	}

	// TODO:
	private void capture(Figure opponentFigure) {

	}

	// TODO:
	public void moveFigure(Figure figure, Field field) {
		for (Field fieldOfFigure : figure.getPossibleFieldsToMove()) {
			if (true)
				;
		}
	}
}
