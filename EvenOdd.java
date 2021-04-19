package first;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
	     int a = s.nextInt();
	   //  int rem = a % 2;
	   //  boolean result = rem == 0;
			
		if(a%2==0) {
			System.out.println(a + " Number is even");
	}if(a%2==1) {
		    System.out.println(a + " Number is odd");

//		else {
//			System.out.println(a + " Number is Odd");

		}
		

	}

}
