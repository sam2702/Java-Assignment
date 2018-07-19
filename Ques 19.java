import java.util.Scanner;
public class problem19
{
	public static String[] extract(String s)
	{
		String word=new String[2];
		word[0]=s.substring(0,1);
		word[1]=s.substring(1);
		while("AEIOU".indexOf(word[1].charAr(0))==-1)
		{
			word[0]=word[0]+word[1].substring(0,1);
			word[1]=word[1].substring(1);
			if(words[1].length()==0)
			{
				return word;
			}
		}
		return word;
	}
	public static String convert(String t)
	{
		char c=t.charAt(0);
		if("AEIOU".indexOf(c)!=-1)
		{
			return t+"AY";
		}
		String extract[]=extract(t);
		return extract[1]+extract[0]+"AY";
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String s=sc.nextLine();
		StringTokenizer st=new stringTokenizers," ",true);
		while(st.hasMoreTokens())
		{
			String tok=st.nextToken();
			if(tok.equals(" "))
			{
				System.out.println(tok);
				continue;
			}
			System.out.print(convert(tok));
		}
		System.out.println();
	}
}