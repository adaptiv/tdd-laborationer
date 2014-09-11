package se.tddcourse.pmlib;

import java.util.Stack;

public class Kalkylator {
	
	private final Stack<Integer> siffror = new Stack<>();
	
	
	public boolean ange(int siffra) {
		return siffror.add(siffra);
	}

	public int addera() {
		int resultat = 0;
		
		for (Integer siffra: siffror) {
			resultat += siffra;
		}
		
		return resultat;
	}

}
