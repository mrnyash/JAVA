package first;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int sum =0;
		while(i<=n) {
			
			sum = i+ sum;
			i++;
		}
		System.out.print("Sum uptill "+ n+" is "+sum);
		
	}

}
