import java.util.*;
public class firstway
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
		int arr1[] = new int[length];
		int j=0;
		for(int i=length-1;i>=0;i--)
		{
			arr1[j]=arr[i];
			j++;
		}
		for(int i=0;i<length;i++)
		{
			arr[i]=arr1[i];
			System.out.print(arr[i]+" , ");
		}
		
	}
}