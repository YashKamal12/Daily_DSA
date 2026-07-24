import java.util.*;
class Brute {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half sorted
            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half sorted
            else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
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
			System.out.println("Enter The Target Value : ");
			int target = sc.nextInt();
			int ans = search(arr,target);
			System.out.println(ans);
	}
}