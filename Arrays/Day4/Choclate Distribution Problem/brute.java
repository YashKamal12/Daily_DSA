import java.util.*;

class brute {
    public static int findMinDiff(int[] arr, int m) {
        if (m == 0 || arr.length == 0) {
            return 0;
        }

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - m; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Length : ");
		int length = sc.nextInt();
		int arr[] = new int[length];
		for(int i=0;i<length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the nbumber of students : ");
		int m = sc.nextInt();
		int ans  = findMinDiff(arr,m);
		System.out.println(" Distribution is  : "+ans);
	}
}