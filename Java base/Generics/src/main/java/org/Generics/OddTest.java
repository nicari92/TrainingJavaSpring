package org.Generics;

public class OddTest implements Test<Integer> {
	public boolean test(Integer i) { 
		return i % 2 != 0;
	}
}
