package crossword.dictionary;


enum Direction {
	HORIZ, VERT;

}

public class CwEntry extends Entry {
	private Direction d; // czy dane hasło jest umieszczone poziomo, czy pionowo w krzyżówce
	private int x; // pozioma wsp hasła
	private int y; // pionowa wsp hasła

	public CwEntry(String word, String clue) {
		super(word, clue);

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getDir() {
		return 0;
	}

}
