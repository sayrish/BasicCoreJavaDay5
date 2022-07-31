

public class Power_of_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arg=Integer.parseInt(args[0]);
		int result=1;
		if(arg<31&&arg>0)
		{
			for (int i = 0; i < arg; i++)
			{
			result=result*2;	
			}
		}
		int j=1;
		while(j<=result)
		{
			j=j*2;
			System.out.println(j);
		}
	}

}
