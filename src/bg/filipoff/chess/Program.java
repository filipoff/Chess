package bg.filipoff.chess;

public class Program {

	public static void main(String[] args) {
		Field f = new Field(Constants.Color.WHITE, (byte) 0, (byte) 0);
		
		System.out.println(f.getPosition() + " " + f.getColor());
	}

}
