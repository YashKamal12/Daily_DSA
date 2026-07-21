import java.util.*;
public class KadanesApproach
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
		int currSum = arr[0];
		int max = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			currSum = Math.max(arr[i],currSum+arr[i]);
			max=Math.max(max,currSum);
		}
		System.out.println("Max = "+max);
		
	}
}