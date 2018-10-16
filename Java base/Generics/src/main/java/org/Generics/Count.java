package org.Generics;

import java.util.Collection;

public class Count {
	public static <T> int count(Collection<T> c, Test<T> t) {
		int i = 0;
	    for (T e : c)
	    	if (t.test(e))
	    		i++;
	        return i;
	    }
}
