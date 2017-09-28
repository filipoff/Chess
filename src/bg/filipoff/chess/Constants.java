package bg.filipoff.chess;

import java.util.HashMap;
import java.util.Map;

public class Constants {

	public static int BOARD_LENGTH = 8;

	public static int BOARD_WIDTH = 8;

	@SuppressWarnings("serial")
	public static Map<Figure, String> FigureStringRepresentation = new HashMap<Figure, String>() {
		{
			put(new King(null, null), "K");
			put(new Rook(null, null), "R");
		};
	};

	public enum Color {

		WHITE {
			@Override
			String shortString() {
				return "W";
			}
		},
		BLACK {
			@Override
			String shortString() {
				return "B";
			}
		};

		Color toggle() {
			if (this.equals(WHITE))
				return BLACK;
			else
				return WHITE;
		}

		abstract String shortString();
	}
}
