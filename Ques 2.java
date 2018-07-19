import java.util.Scanner;
public class problem2
{
	public static void main(String args[])
	{
		int num,i,count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:-\n");
		num=scan.nextInt();
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("The number is a prime number");
		}
		else
		{
			System.out.println("The number is not prime number");
		}
	}
}
				