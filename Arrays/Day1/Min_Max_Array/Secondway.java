
import java.util.*;

public class Secondway{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.print("Enter The Length of the array : ");
		int length = sc.nextInt();
		for(int i=0;i<length;i++)
		{
			System.out.print("Enter The Number of "+i+" : ");
			int num = sc.nextInt();
			arr.add(num);
		}
		int min=arr.get(0);
		int max = arr.get(0);
		for(int i=0;i<length;i++)
		{
			if(min>arr.get(i))
			{
				min=arr.get(i);
			}
			if(max<arr.get(i))
			{
				max=arr.get(i);
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(min);
		ans.add(max);
		System.out.println(ans);
		
		
	}
}