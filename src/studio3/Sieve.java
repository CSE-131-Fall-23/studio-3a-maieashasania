package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pick a number.");
		int number = scan.nextInt();
		
		int[] sieve=new int[number];
		for (int i=0; i < number; i++) {
			
			sieve[i] = i;
		}
		
		for (int i=2; i < number; i++) {
			
			for(int j=i*2; j < number; j=j+i) {
				sieve[j] = -1;
			}		
			
		}
		for (int i=2; i < number; i++) {
			if (sieve[i]!=-1) {
				System.out.println(i);
			}
		}
	}
}
