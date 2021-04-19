package first;

import java.util.Scanner;

public class ConditionalAndRelational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner (System.in);

		int a = s.nextInt();
		int b = s.nextInt();



		//      if(a != b) {
		//    	 
		//    	  System.out.println("Not Equal");
		//      }else {
		//    	  System.out.println("Equal");;
		//
		//      }

		
		
		
		if(a >b) {

			System.out.println("a is greater");

		}
		else if(b>a) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("a and b are equal");
			
		}
		

		


//		if(a >b) {
//
//			System.out.println("a is greater");
//
//		}else {
//			if(a==b) {
//				System.out.println("a and b are equal");
//			}else {
//				System.out.println("b is greater");
//			}
//		}

	}
}
