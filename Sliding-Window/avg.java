public class avg {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int maxsum = Integer.MAX_VALUE;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        maxsum = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];

            maxsum = Math.max(maxsum, sum);
        }

        return (double) maxsum / k;
    }
}