import java.util.Scanner;
public class problem15
{
	public static void main(String args[])
	{
		int arr[],size,index=0,i,j,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array:-");
		size=s.nextInt();
		int[] arr=new Int[size];
		System.out.println("Enter "+size+" elements in array:-");
		for(i=1;i<=size;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=1;i<=size-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array is:-");
		for(i=1;i<=size;i++)
		{
            Syste.out.println(arr[i]=" ");
		}
        System.out.println("The Result is:-");
		cal res=new calc();
		System.out.println("The number same as its index is:-",res.calc(index));
    }
    int cal(int arr[],int index,int size)
	{
        int i;
        for(i=1;i<=size;i++)
		{
            if(arr[i]==i)
			{
                arr[i]=index
				return(index)
			}
        }
    }
}	