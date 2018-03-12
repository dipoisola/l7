package l7.two;

public class MyTable {
	private Entry[] entries = new Entry[26];
	
	public String get(char c) {
		if (entries[c - 'a'] != null) {
			return entries[c - 'a'].s;
		}
		
		return "";
	}
	
	public void add(char c, String s) {
		String a = "a";
		
		Entry newEntry = new Entry(c, s);
		entries[String.valueOf(c).compareTo(a)] = newEntry;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		
		for (Entry e : entries) {
			str.append(e);
		}
		
		return str.toString();
	}



	class Entry {
		char c;
		String s;
		
		public Entry(char c, String s) {
			this.c = c;
			this.s = s;
		}
		
		@Override
		public String toString() {
			return c + "->" + s + "\n";
		}
	}
}
