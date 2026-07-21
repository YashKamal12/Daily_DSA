import java.util.*;
public class Recursive
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
		arr = reverse(arr,0,length-1);
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+" , ");
		}
		
	}
	static int[] reverse(int[] arr,int start,int end)
	{
		if(start>end)
		{
			return arr;
		}
		
		int tnum=arr[start];
		arr[start] =arr[end];
		arr[end] = tnum;
		
		return reverse(arr,start+1,end-1);
		
	}
}