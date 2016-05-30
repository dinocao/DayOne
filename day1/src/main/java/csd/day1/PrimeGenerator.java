package csd.day1;
/**
 * Refactorings:
 * 
 * Extract Fields.
 * Extract Methods: initArrayOfIntegers, crossOutMultiples, putUncrossedIntegerIntoResult
 * Inline s with f.length
 * Rename f to isCrossed
 * Ensure for loop starts from 2
 * Extract Methods: crossOutMultipleOf, numberOfUncrossedIntegers, notCrossed
 * Rename methods to: uncrossIntegersUpTo
 * @author jacky
 * 
 */

public class PrimeGenerator {
	private int sizeOfArray;
    public static void main(String[] args)
    {
    	System.out.println("cccc");
        System.out.print(Math.sqrt(9));
		
		
    }
	/**
	 * 
	 * @param maxValue
	 *            is the generation limit
	 * @return
	 */
	public int[] generatePrimes(int maxValue) {
		if(maxValue < 2)
			// return null array if bad input.
			return new int[0]; 
		// declarations
		sizeOfArray = maxValue + 1; 
		//initialze prime numbers
		boolean[] primeNumbersState = asPrimeNumbersInitial(sizeOfArray);
		primeNumbersState[0] = primeNumbersState[1] = false;
		// sieve primes state false
		sievePrimeNumbersFalse(sizeOfArray, primeNumbersState);
		// take primes state true
		return takePrimeNumbersTrue(sizeOfArray, primeNumbersState);
		
	}
	// sieve not prime numbers	
	private int[] takePrimeNumbersTrue(int sizeOfArray,
			boolean[] primeNumbersState) {
		int count = 0;
		for (int i = 0; i < sizeOfArray; i++) {
			if (primeNumbersState[i])
				count++; // bump count
		}

		int[] primes = new int[count];

		// move the primes into the result
		for (int i = 0, j = 0; i < sizeOfArray; i++) {
			if (primeNumbersState[i])
				primes[j++] = i;
		}

		return primes;
	}
	
	// sieve not prime numbers
	private boolean[] sievePrimeNumbersFalse(int sizeOfArray,
			boolean[] primeNumbersState) {
		for (int i = 2; i < Math.sqrt(sizeOfArray) + 1; i++) {
			for (int j = 2 * i; j < sizeOfArray; j += i) {
				primeNumbersState[j] = false; // multiple is not prime
			}
		}
		return primeNumbersState;
	}
	
	//initialze prime numbers
	private boolean[] asPrimeNumbersInitial(int sizeOfArray) {
		boolean[] primeNumbersState = new boolean[sizeOfArray];
		// initialize array to true
		for (int i = 0; i < primeNumbersState.length; i++) {
			primeNumbersState[i] = true;
		}
		return primeNumbersState;
	}
}
