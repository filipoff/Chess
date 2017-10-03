package bg.filipoff.chess;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Figure {

	public Bishop(Player owner, Field field) {
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

		for (int i = currentPositionRow - 1, j = currentPositionColumn - 1; i >= 0
				&& j >= 0; i--, j--) {

			Field possibleField = getField().getBoard().getFieldAt(i, j);

			if (possibleField != null)
				possibleFieldsToMove.add(possibleField);
		}

		for (int i = currentPositionRow + 1, j = currentPositionColumn + 1; i < Constants.BOARD_LENGTH
				&& j < Constants.BOARD_WIDTH; i++, j++) {

			Field possibleField = getField().getBoard().getFieldAt(i, j);

			if (possibleField != null)
				possibleFieldsToMove.add(possibleField);
		}

		for (int i = currentPositionRow + 1, j = currentPositionColumn - 1; i < Constants.BOARD_LENGTH
				&& j >= 0; i++, j--) {

			Field possibleField = getField().getBoard().getFieldAt(i, j);

			if (possibleField != null)
				possibleFieldsToMove.add(possibleField);
		}

		for (int i = currentPositionRow - 1, j = currentPositionColumn + 1; i >= 0
				&& j < Constants.BOARD_WIDTH; i--, j++) {

			Field possibleField = getField().getBoard().getFieldAt(i, j);

			if (possibleField != null)
				possibleFieldsToMove.add(possibleField);
		}

		return possibleFieldsToMove;
	}
}
