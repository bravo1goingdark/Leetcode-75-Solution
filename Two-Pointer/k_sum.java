import java.util.Arrays;

public class k_sum {
    public int maxOperations(int[] nums, int k) {
    Arrays.sort(nums); // Sort the array in ascending order
    int count = 0;
    int start = 0;
    int end = nums.length - 1;
    
    while (start < end) {
        int sum = nums[start] + nums[end];
        if (sum == k) {
            count++;
            start++;
            end--;
        } else if (sum < k) {
            start++;
        } else {
            end--;
        }
    }
    
    return count;
    }
}
