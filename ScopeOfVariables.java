package first;

public class ScopeOfVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =1;
		int j =10;
		
	//	System.identityHashCode(i);

		while(i<=5) {
			j=10;
		//	int j = 10;
			System.out.println(j);
			i++;
			j++;
		}
		System.out.println(i);
		System.out.println(j);
		

	}

}
