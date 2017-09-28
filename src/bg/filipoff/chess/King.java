package bg.filipoff.chess;

import java.util.ArrayList;
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

		List<Field> possibleFieldsToMove = new ArrayList<Field>();

		int currentPositionRow = getField().getPosition().getRow();
		int currentPositionColumn = getField().getPosition().getColumn();

		for (int i = -1; i <= 1; i++) {

			for (int j = -1; j <= 1; j++) {

				// skip the current position of the king
				if (i == 0 && j == 0)
					continue;

				try {
					Field possibleField = getField().getBoard().getFieldAt(
							currentPositionRow + i, currentPositionColumn + j);

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
