package programming_basics;

import java.util.ArrayList;

public class LetterCount {

	public static void main(String[] args) {
		ArrayList<Integer> primeVals = new ArrayList<Integer>();
		for( int i = 2; i < 20; i++) {
			boolean isPrime = true;
			for(int p : primeVals) {
				if(i%p == 0) {
					isPrime = false;
					break;
					} 	
			} if (isPrime) {
				primeVals.add(i);
			}
		}
		System.out.println(primeVals);
	 
	}

}
