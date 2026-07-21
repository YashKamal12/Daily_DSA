import java.util.*;
public class first
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Length : ");
		int length = sc.nextInt();
		int arr[]= new int[length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i;j<length;j++)
			{
				sum=sum+arr[j];
				max=Math.max(max,sum);
			}
		}
		System.out.println("Max = "+max);
		
	}
}