
import java.util.*;

public class Firstway{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.print("Enter The Length of the array : ");
		int length = sc.nextInt();
		for(int i=0;i<length;i++)
		{
			System.out.println("Enter The Number of "+i+" : ");
			int num = sc.nextInt();
			arr.add(num);
		}
		//Arrays.sort(arr);
		//int min  = arr[0];
		//int max=arr[length-1];
		Collections.sort(arr);
		int min  = arr.get(0);
		int max=arr.get(length-1);
		ArrayList<Integer> ans  = new ArrayList<>();
		ans.add(min);
		ans.add(max);
		System.out.println(ans);
		
	}
}