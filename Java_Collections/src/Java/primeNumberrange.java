package Java;

public class primeNumberrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number = 7;
		boolean flag =false;
		
		for (int j=2;j<=number/2;j++) {
			if(number%j==0) {
				flag = true;
				break;
			}
			
		}
		if(flag==true) {
			System.out.println("number is not prime");
		}
		else {
			System.out.println("number is prime");
		}
	}

}
