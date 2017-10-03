package bg.filipoff.chess;

import bg.filipoff.chess.Constants.Color;

public class Program {

	public static void main(String[] args) {

		Board b = new Board();
		Player p1 = new Player(Color.WHITE);

		// King k = new King(p1, b.getFieldAt(0, 7));
		// Rook r = new Rook(p1, b.getFieldAt(4, 3));
		Queen q = new Queen(p1, b.getFieldAt("h1"));
		// Bishop bi = new Bishop(p1, b.getFieldAt("d5"));

		System.out.println(p1.getFiguresInPlay().get(0).getField()
				.getPosition());
		System.out.println(p1.getFiguresInPlay().get(0)
				.getPossibleFieldsToMove().size());
		for (Field f : p1.getFiguresInPlay().get(0).getPossibleFieldsToMove())
			System.out.print(f.getPosition() + ", ");
		System.out.println();
		b.print();

	}
}
