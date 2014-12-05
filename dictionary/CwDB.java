package crossword.dictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.ListIterator;

public class CwDB implements Serializable {


	protected LinkedList<Entry> dict;

	public CwDB(String filename) {
		boolean exists = (new File(filename)).exists();
		if (exists) {
			dict = new LinkedList<Entry>();
			createDB(filename);
		} else {
			throw new Error("Plik z baza nie istnieje.");
		}

	}

	public void add(String word, String clue) {
		dict.add(new Entry(word, clue));

	}

	public Entry get(String word) {
		ListIterator<Entry> iter = dict.listIterator();
		while (iter.hasNext()) {
			Entry var = iter.next();
			if (var.getWorld().equals(word)) {
//				System.out.println(var.getWorld());
				return var;

			}
		}

		return null;

	}

	public void remove(String word) {
		ListIterator<Entry> iter = dict.listIterator();
		while (iter.hasNext()) {
			Entry var = iter.next();
			if (var.getWorld().equals(word)) {
				iter.remove();

			}
		}

	}

	public void saveDB(String filename) {

	}

	public int getSize() {

		return dict.size();

	}

	protected void createDB(String filename) {
		try {
			FileReader fileRead = new FileReader(filename);
			BufferedReader buffRead = new BufferedReader(fileRead);
			String word, clue;
			while ((word = buffRead.readLine()) != null) {
				if ((clue = buffRead.readLine()) != null) {
					add(word, clue);

				}
			}
			fileRead.close();
		} catch (Exception e) {
			System.out.println("createDB ERROR" + e.getMessage());
		}

	}
//	public static void main(String[] args){
//		CwDB cwdb = new CwDB("cwdb.txt");
//    	cwdb.createDB("cwdb.txt");
//    	System.out.println(cwdb.getSize());
//    	System.out.println(cwdb.get("Agata").getWorld());
//    	System.out.println(cwdb.get("Agata").getClue());
//	}

}
