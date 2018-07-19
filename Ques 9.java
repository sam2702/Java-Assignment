import java.util.Scanner;
public static void main()
{
	public static void main(String args[])
	{
		int num;
		Scanner s=new Scanner(System.in)
		System.out.println("Enter the number:-\n");
		num=s.nextInt();
		if(num/2==0 && num/5==0)
		{
			System.oout.println("The entered number "+num+" is HiEven as well as HiFive");
		}
		else if(num/2==0)
		{
			System.out.println("The entered number "+num+" is HiEven");
		}
		else if(num/5==0)
		{
			System.out.println("The entered number "+num+" is HiFive");
		}
		else
		{
			System.out.println("The entered number is neither HiFive now HiEven");
		}
	}
}