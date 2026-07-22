import java.util.*;
public class Optimal
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
		Arrays.sort(arr);
		int flg=0;
		for(int i=0;i<num-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				System.out.print(true);
				flg=1;
				break;
			}
		}
		if(flg==0)
		{
		System.out.print(false);
		}
	}
}
