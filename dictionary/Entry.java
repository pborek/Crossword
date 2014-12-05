package crossword.dictionary;

import java.io.Serializable;

public class Entry implements Serializable {
	private String word;
	private String clue;

	public Entry(String word, String clue) {
		this.word = word;
		this.clue = clue;

	}

	public String getWorld() {
		return word;

	}

	public String getClue() {
		return clue;

	}

}
