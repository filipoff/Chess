package bg.filipoff.chess;

import java.util.LinkedList;
import java.util.List;

public class King extends Figure {

	public King(Player owner, Field field) {
		super(owner, field);
	}

	@Override
	public String toString() {
		return super.getOwner().getColor()
				+ Constants.FigureStringRepresentation.get(this);
	}

	@Override
	public List<Field> getPossibleFieldsToMove() {

		List<Field> possibleFieldsToMove = new LinkedList<Field>();

		for (int i = -1; i <= 1; i++) {

			for (int j = -1; j <= 1; j++) {

				if (i == 0 && j == 0)
					continue;

				try {
					Field possibleField = this
							.getField()
							.getBoard()
							.getFieldAt(
									this.getField().getPosition().getRow() + i,
									this.getField().getPosition().getColumn()
											+ j);
					if (possibleField != null)
						possibleFieldsToMove.add(possibleField);

				} catch (IllegalArgumentException e) {
					System.out.println("Exception caught in King");
				}
			}
		}
		return possibleFieldsToMove;
	}
}
