package first;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i =1;
		while(i<=n) {
			int j =1;
			while(j<=n+n) {
				if(j<=n) {
					if(j<=n-i+1)
						System.out.print(' ');
					else
						System.out.print("*");

				}else {
					if(j>=n+i)
						System.out.print(' ');
					else
						System.out.print("*");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
