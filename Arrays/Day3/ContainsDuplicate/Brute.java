import java.util.*;
public class Brute
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		int flg=0;
		for(int i=0;i<num-1;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(true);
					flg=1;
					break;
				}
			}
		}
		if(flg==0)
		{
			System.out.print(false);
		}
		
	}
}