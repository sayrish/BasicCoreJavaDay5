

import java.util.Scanner;

public class Harmonic_number {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double nth_num=sc.nextDouble();
		double sum=0;
		for(double i=1;i<=nth_num;i++)
		{
			sum=sum+(1/i);
		}
		System.out.println("nth Harmonic number is "+sum);
	}

}
