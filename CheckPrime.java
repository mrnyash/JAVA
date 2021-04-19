package first;

import java.util.Scanner;

public class CheckPrime {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner s =new Scanner(System.in);
		n = s.nextInt();
		
		int i = 2;
		while(i<=n/2) {
			
			if( n%i==0) {
				System.out.println("It is not a prime number");
				return;
			}
			else {
				i++;
			}
		}
		
		if(n==1) {
		System.out.println("It is not a prime number");
		return;
		}
			System.out.println("It is a prime number");

		}
	}


