package bg.filipoff.chess;

import bg.filipoff.chess.Constants.Color;

public class Program {

	public static void main(String[] args) {

		Board b = new Board();
		Player p1 = new Player(Color.WHITE);
		p1.addFigureInPlay(new King(p1, b.getFieldAt(0, 0)));

		for (Field f : p1.getFiguresInPlay().get(0).getPossibleFieldsToMove())
			System.out.print(f.getPosition() + ", ");
		System.out.println();
		b.print();
	}

}
