

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.nextLine().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("VOwel");
		}
		else
		{
			System.out.println("Consonant");
		}

	}

}
