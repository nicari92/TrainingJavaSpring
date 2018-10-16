package org.StringInversion;

public class Chars implements CharSequence{
	private String str;
	
	public Chars(String s) {
		this.str = s;
	}

	public int length() {
		return str.length();
	}

	public char charAt(int i) {
		if ((i < 0) || (i >= str.length())) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return str.charAt(i);
	}
	
	public CharSequence subSequence(int start, int end) {
		 if (start < 0) {
	            throw new StringIndexOutOfBoundsException(start);
	        }
	        if (end > str.length()) {
	            throw new StringIndexOutOfBoundsException(end);
	        }
	        if (start > end) {
	            throw new StringIndexOutOfBoundsException(start - end);
	        }
		return (str.subSequence(start, end).toString());
	}
	
	public String toString() {
        StringBuilder s = new StringBuilder(this.str);
        return s.reverse().toString();
    }

}
