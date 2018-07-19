import java.util.Scanner;
public class problem3
{
	static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return(n*factorial(n-1));
	}
	public static void main()
	{
		int num,fact;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:-\n");
		num=scan.nextInt();
		fact=factorial(number);
		System.out.println("Factorial of "+num+" is "+fact);
	}
}