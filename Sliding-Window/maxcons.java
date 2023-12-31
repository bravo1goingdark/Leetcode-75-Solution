public class maxcons {
    public int longestOnes(int[] nums, int k) {
        int max1 = 0;
        int left = 0;
        int zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            max1 = Math.max(max1, right - left + 1);
        }

        return max1;
        
    }
    
}
