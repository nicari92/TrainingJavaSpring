package org.StoreModel;

import java.util.HashSet;

public class TessereFedelta {
	
	private static HashSet<Integer> tessere;
	
	private static TessereFedelta instance;
	
	private TessereFedelta() {
		tessere=new HashSet<Integer>();
	}
	
	public static TessereFedelta getInstance(){
        if(instance == null){
            instance = new TessereFedelta();
        }
        return instance;
    }
	
	
	public static Integer nuovaCartaFedelta () {
		int key=tessere.size()+1;
		tessere.add(key);
		return tessere.size();
	}
	
}
