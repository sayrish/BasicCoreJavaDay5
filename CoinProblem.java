

import java.util.Scanner;

public class CoinProblem {

	static int head=0;
	static int tail=0;
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of flipps: ");
	int number_flipps=sc.nextInt();
	if(number_flipps>0)
	{
		for(int i=0;i<number_flipps;i++)
		{
			double toss= (Math.random()*10)%2;
			System.out.println((int)toss);
			if((int)toss==1)
				head++;
			else
				tail++;
					
		}
	}
	System.out.println(head+" "+tail);
	//float percent_head=head/number_flipps;
	System.out.println("Percentage of getting head "+((double)head/number_flipps));
	System.out.println("Percentage of getting tail "+((double)tail/number_flipps));

	}

}
