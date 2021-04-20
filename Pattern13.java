package first;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i =1;
		
		while(i<=n) {

			int j=1;
			
			while(j<=n-i+1) {
				
				System.out.print((char)('A'+j-1));
				
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
