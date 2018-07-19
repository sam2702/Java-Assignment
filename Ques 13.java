import java.util.Scanner;
public class problem13
{
	public static void main(String args[])
	{
		int arr[],len;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size of array:-");
		len=s.nextInt();
		System.out.println("Enter "+size+" elements in array:");
		for(i=0;i<size;i++)
		{
			arr[i]=s.nextint();
		}
		duplicate dupli=new duplicate();
		dupli.duplicate(arr,len);
	}
	void duplicate(int arr[],int len)
	{
		int i,j;
		System.out.println("Duplicate elements are:-");
		for(i=1;i<=len;i++)
		{
			for(j=i+1;j<=size;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i] +" ");
				}
			}
		}
	}
}
		