package first;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i =1;
		while(i<=n) {
			int j =1;
		
			while(j<=i) {
				if(i<=2)
               System.out.print(1);
			else
				if(j==1 || j==i)
	           System.out.print(i-1);
				else
		       System.out.print(0);

            j++;
			}
            System.out.println();
            i++;

		}
	}

}
