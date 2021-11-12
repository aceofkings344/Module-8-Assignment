import java.util.*;

public class CreateArray {
	
	public static void getArray(int[] a) {
		int min = 1;
		int max = 10;
		
		Random r = new Random();
		
		for(int i = 0; i < a.length; i++) {
			a[i] = r.nextInt((max - 1) + min) + min;
		}
		
	}

}
