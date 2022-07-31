

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year:");
		int year=sc.nextInt();
		boolean flag=true;
		if(year%4==0)
		{
			if(year%100==0&&year%400==0)
			{
				flag=true;
			}
			
		}
		else 
			flag=false;
		if(flag==true)
			System.out.println("This is leap year");
		else
			System.out.println("This is regular year");

	}
	
}
