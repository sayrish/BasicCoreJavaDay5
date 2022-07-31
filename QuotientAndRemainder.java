

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dividend:");
		int dividend=sc.nextInt();
		System.out.println("Enter divisor:");
		int divisor=sc.nextInt();
		System.out.println("Quotient is:"+(dividend/divisor));
		System.out.println("remainder is: "+(dividend%divisor));
	}

}
