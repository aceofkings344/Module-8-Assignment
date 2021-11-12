import java.text.*;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[200000000];
		int parallel;
		long parallelTime;
		int one;
		long oneTime;
		
		CreateArray.getArray(num);
		
		long startTime1 = System.nanoTime();
		parallel = Summation.parallelSum(num);
		long endTime1 = System.nanoTime();
		
		long startTime2 = System.nanoTime();
		one = Summation.sum(num);
		long endTime2 = System.nanoTime();
		
		parallelTime = endTime1 - startTime1;
		oneTime = endTime2 - startTime2;
		
		//System.out.println("The sum for parallel was " + parallel + " and had a time of " + parallelTime);
		//System.out.println("The sum for single was " + one + " and had a time of " + oneTime);
		
		//System.out.println();
		
		System.out.printf("The sum for parallel was %,d and had a time of %,d\n", parallel, parallelTime);
		System.out.printf("The sum for single was %,d and had a time of %,d\n", one, oneTime);
		
	}

}
