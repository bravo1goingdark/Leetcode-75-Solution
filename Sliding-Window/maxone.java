public class maxone {
    public int longestSubarray(int[] nums) {

        int length = 0;
        int left = 0;
        int zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            length = Math.max(length, right - left);
        }

        return length;
        
    }
}