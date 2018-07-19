import java.util.Scanner;
public class Problem8
{
	int sum=0;
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:-\n");
		n=s.nextInt();
		Problem8 obj=new Problem8();
		int a=obj.add(n);
		System.out.println("Sum:"+a);
	}
	int add(int n)
	{
		sum=n%10;
		if(n==0)
		{
			return 0;
		}
		else
		{
			return sum+add(n/10);
		}
	}
}