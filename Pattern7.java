package first;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i =1;
		
		while(i<=n) {
		    int a = i;
			int j=1;

			while(j<=i) {

				System.out.print(a);
				a++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
