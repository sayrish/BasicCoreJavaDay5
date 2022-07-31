

import java.util.Scanner;

public class factors {

	public static boolean isPrime(int num)
	{
		if(num==1||num==0)
			return false;
		boolean flag=false;
		for(int i=2;i*i<=num;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			return false;
		else
			return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0&&isPrime(i)==true)
				System.out.println(i);
		}
		//System.out.println(factors.isPrime(2));
	}

}
