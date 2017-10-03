package bg.filipoff.chess;

import java.util.HashMap;
import java.util.Map;

public class Constants {

	public static int BOARD_LENGTH = 8;

	public static int BOARD_WIDTH = 8;

	// TODO: check if "extends" or "super" must be used
	@SuppressWarnings("serial")
	public static Map<Class<? extends Figure>, String> FigureStringRepresentation = new HashMap<Class<? extends Figure>, String>() {
		{
			put(King.class, "K");
			put(Rook.class, "R");
			put(Bishop.class, "B");
			put(Queen.class, "Q");
		}

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
