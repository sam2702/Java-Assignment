import java.io.*;
public class problem17
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String:-");
		String s=br.readLine();
		s=s.toLowerCase();
		int l=s.length();
		char ch;
		System.out.println("Output:-");
		System.out.println("----------");
		System.out.println("Alphabet\tFrequency");
		int count=0;
		for(char i='a';i<='z';i++)
		{
			count=0;
			for(int i=0;i<l;i++)
			{
				ch=charAt(j);
				if(ch==i)
					count++;
			}
			if(count!=0)
			{
				System.out.println(i+"\t\t"+count);
			}
		}
	}
}