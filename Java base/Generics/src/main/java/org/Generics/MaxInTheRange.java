package org.Generics;

import java.util.List;

public class MaxInTheRange {
	
	public static <T extends Object & Comparable<? super T>> T max(List<? extends T> list, int begin, int end) {
		T max = list.get(begin);
    	for (++begin; begin < end; ++begin)
    		if (max.compareTo(list.get(begin)) < 0)
    			max = list.get(begin);
    	return max;
	}
}