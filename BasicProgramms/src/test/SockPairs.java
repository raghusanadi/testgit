package test;

import java.util.HashSet;
import java.util.Set;

public class SockPairs {

	static int sockMerchant(int n, int[] ar) {
		 Set<Integer> colors = new HashSet<>();
		    int pairs = 0;

		    for (int i = 0; i < n; i++) {
		        if (!colors.contains(ar[i])) {
		            colors.add(ar[i]);
		        } else {
		            pairs++;
		            colors.remove(ar[i]);
		        }
		    }
		    return pairs;
	}
	public static void main(String[] args) {
		int[] ar = new int[]{10,10,10,30,10};
		System.out.println("pairs : "+sockMerchant(5,ar));

	}

}
