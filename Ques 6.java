import java.lang.*;
public class problem6
{
	public static void main(String args[])throws IOException
	{
		int i,j,result,input;
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		int num1=Math.rand();
		int num2=Math.rand();
		if(num1>=num2)
		{
			System.out.println("What is "+num1+" and "+num2+" is:-");
			input=Integer.parseInt(br.readLine());
			result=num1-num2;
			if(input==result)
			{
				System.oout.println("You have entered the correct answer");
			}
			else
			{
				System.out.println("You have entered the wrong answer");
			}
		}
	}
}
			
			