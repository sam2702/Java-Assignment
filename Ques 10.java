import java.Util.Scanner;
public class problem10
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Input floating point numbers:-");
		double x=s.nextDouble();
		System.out.println("Input floating point numbers:-");
		double y=s.nextDouble();
		x=Math.round(x*1000);
		x=x/1000;
		y=Math.round(y*1000);
		y=y/1000;
		if(x==y)
		{
			System.out.println("Both the floating point numbers are same");
		}
		else
		{
			System.out.println("Both the floating point numbers are not same");
		}
	}
}