import java.util.Scanner;
public class problem7
{
	public static void main(String args[])throws IOException
	{
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Press a number:-\n");
		num=scan.nextInt();
		if(num>=9)
		{
			if(num=='0')
			{
				System.out.println("You have pressed Zero");
			}
			else if(num=='1')
			{
				System.out.println("You have pressed One");
			}
			else if(num=='2')
			{
				System.out.println("You have pressed Two");
			}
			else if(num=='3')
			{
				System.out.println("You have pressed Three");
			}
			else if(num=='4')
			{
				System.out.println("You have pressed Four");
			}
			else if(num=='5')
			{
				System.out.println("You have pressed Five");
			}
			else if(num=='6')
			{
				System.out.println("You have pressed Six");
			}
			else if(num=='7')
			{
				System.out.println("you have pressed Seven");
			}
			else if(num=='8')
			{
				System.out.printl("You have pressed Eight");
			}
			else
			{
				System.out.printl("You have pressed Nine");
			}
		}
		else
		{
			System.out.println("Not Allowed");
		}
	}
}