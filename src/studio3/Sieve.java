package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("How many numbers: ");
		int n = in.nextInt();

		Boolean[] prime = new Boolean[n+1];
		
		
		//Setting all entries as true
		for(int i = 0; i < prime.length; i++) {
			prime[i] = true;
		}


		for (int k = 2; k < n; k++) {
			if(prime[k] == true) {
				for(int j = 2 * k; j < prime.length; j += k) {
					prime[j] = false;
				}
			}
		}
		for (int p = 0; p < prime.length; p++) {
				System.out.println(prime[p]);
		}
		
		
		
		
	}
}	
