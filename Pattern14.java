package first;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i =1;
		while(i<=n) {
			
			int j =1;
			int p = n-i+1;
			while(j<=n) {
				System.out.print(p);
				if(p<=n)
				p++;
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
