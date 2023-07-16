class zeroes {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
    
        while (right < nums.length) {
            if (nums[right] != 0) {
                // Swap non-zero element to the left side
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
    
                left++;
            }
    
            right++;
        }
    }    
}