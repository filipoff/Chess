package bg.filipoff.chess;

import java.util.List;

import bg.filipoff.chess.Constants.Color;

public class Player {


	private Color color;
	private boolean isInCheck;
	private List<Figure> figuresInPlay;
	
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
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
	public void setFiguresInPlay(List<Figure> figuresInPlay) {
		this.figuresInPlay = figuresInPlay;
	}
	
}
