package crossword.board;

import java.util.LinkedList;

public class Board {
	// dwuwymiarową tablicę komórek BoardCell reprezentującą krzyżówkę
	private BoardCell[][] board;

	public int getWidth() {
		return 0;
	}

	public int getHeight() {
		return 0;
	}

	// metoda pobierająca wartość danej komórki
	public BoardCell getCell(int x, int y) {
		return null;

	}

	// metoda ustawiająca wartość danej komórki
	public void setCell(int x, int y, BoardCell c) {

	}

	// zwracająca wszystkei komórki, które mogą być początkiem dla nowego hasła
	public LinkedList<BoardCell> getStartCells() {
		return null;

	}

	// tworzącą wzorzec wyrażenia regularnego
	public String createPattern(int fromx, int fromy, int tox, int toy) {
		return null;
	}
}
