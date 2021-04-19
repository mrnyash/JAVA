package first;

import java.util.Scanner;

public class LargestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
		int a,b;
		a = s.nextInt();
		b = s.nextInt();
       
		if(a > b) {
			System.out.println("First 1st num is greater");
		}else {
			System.out.println("Else 2nd num is greater");

	}

		 System.out.println("Outside if else statement");
	}
}
