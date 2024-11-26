//WAP to find the factorial of a number
import java.lang.*;//Default package(Language) for all java programs 
//import java.util.*;
class Factorial
{
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
		int fact=1;
		int n=5;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}//End of for

		System.out.println("The factorial of "+n+" is "+ fact);
	}//End of main
}//End of class