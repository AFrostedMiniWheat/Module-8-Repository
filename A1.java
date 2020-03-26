package assignment;

import java.util.*;

public class A1 {
	private static final Random RAND = new Random(42);
	// random number generator

	public static void main(String[] args) throws Throwable {
		int LENGTH = 1000;   // initial length of array to sort
		int RUNS   =   17;   // how many times to grow by 2?

		for (int i = 1; i <= RUNS; i++) {
			int[] a = new int[5];

			// run the algorithm and time how long it takes
			long startTime1 = System.currentTimeMillis();
			int total = 0;
			for (int j = 1; j <= 100; j++) {
				total = sum3(a, 4);
			}
			long endTime1 = System.currentTimeMillis();
			
			int correct = sum(a);
			if (total != correct) {
				throw new RuntimeException("wrong sum: " + total + " vs. " + correct);
			}

			System.out.printf("%10d elements  =>  %6d ms \n", LENGTH, endTime1 - startTime1);
			LENGTH *= 2;   // double size of array for next time
		}
	}
	
	private static int sum3(int[] a, int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int[] createRandomArray(int lENGTH) {
		// TODO Auto-generated method stub
		return null;
	}

	// Computes the total sum of all elements of the given array.
	public static int sum(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}
	
