import java.util.Scanner;
public class problem12
{
	public static void main(String args[])
	{
		int weight,height;
		double pweight,pheight,BMI;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your weight in pounds:-");
		weight=s.nextInt();
		System.out.println("Enter your height in inches:-");
		height=s.nextInt();
		pweight=weight*(45359237/100000000);
		pheight=height*(254/1000);
		BMI=pweight/(pheight*pheight);
		if(BMI<18.5)
		{
			System.out.println("You are underweight");
		}
		else if(BMI>=18.5 && BMI<25.0)
		{
			System.out.println("You are Normal");
		}
		else if(BMI>=25.0 && BMI<30.0)
		{
			System.out.println("You are Overweight");
		}
		else
		{
			System.out.println("You are Obese");
		}
	}
}