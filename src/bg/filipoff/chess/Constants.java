package bg.filipoff.chess;

public class Constants {
	public static int BOARD_LENGTH = 8;

	public static int BOARD_WIDTH = 8;

	public enum Color {
		
		WHITE, BLACK;

		Color toggle() {
			if (this.equals(WHITE))
				return BLACK;
			else
				return WHITE;
		}
	}
}
