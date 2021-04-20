package first;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i =1;
		
		while(i<=n) {

			int j=1;
			int p = i;
			while(j<=n) {
				
				System.out.print((char)('A'+p-1));
				p++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
