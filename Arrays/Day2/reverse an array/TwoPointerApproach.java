import java.util.*;
public class TwoPointerApproach
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
		for(int i=0,j=length-1;i<j;i++,j--)
		{
			int tnum = arr[i];
			arr[i]=arr[j];
			arr[j]=tnum;	
		}
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+" , ");
		}
		
	}
}