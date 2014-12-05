package crossword;

import java.util.Iterator;
import java.util.LinkedList;

import crossword.board.Board;
import crossword.dictionary.CwEntry;
import crossword.dictionary.Entry;
import crossword.dictionary.InteliCwDB;

public class Crossword {
	private LinkedList<CwEntry> entries;
	private Board b;
	private InteliCwDB cwdb;
	private final long ID = 1;

	// metoda zwracająca iterator Read Only, który nie pozwala na np. usuwanie
	// elementów z listy.
	public Iterator<CwEntry> getROEntryIter() {
		return null;

	}

	public Board getBoardCopy() {
		return b;

	}

	public InteliCwDB getCwDB() {
		return cwdb;

	}

	public void setCwDB(InteliCwDB cwdb) {

	}

	public boolean contains(String word) {
		return false;

	}

	public final void addCwEntry(CwEntry cwe, Strategy s) {
		entries.add(cwe);
		s.updateBoard(b, cwe);

	}

	public final void generate(Strategy s) {
		Entry e = null;
		while ((e = s.findEntry(this)) != null) {
		//	addCwEntry(e, s);
		}

	}

}
