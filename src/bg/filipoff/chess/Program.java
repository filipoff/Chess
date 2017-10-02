package bg.filipoff.chess;

import bg.filipoff.chess.Constants.Color;

public class Program {

	public static void main(String[] args) {

		Board b = new Board();
		Player p1 = new Player(Color.WHITE);

		King k = new King(p1, b.getFieldAt(0, 8));
		// Rook r = new Rook(p1, b.getFieldAt(4, 3));
		p1.addFigureInPlay(k);

		System.out.println(p1.getFiguresInPlay().get(0).getField()
				.getPosition());
		for (Field f : p1.getFiguresInPlay().get(0).getPossibleFieldsToMove())
			System.out.print(f.getPosition() + ", ");
		System.out.println();
		b.print();
	}

}
