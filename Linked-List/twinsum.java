public class twinsum {
    public int pairSum(ListNode head) {
        int max = 0;
        ListNode temp = head;
        int size = 0;
    
        // Step 1: Find the size of the linked list
        while (temp != null) {
            size++;
            temp = temp.next;
        }
    
        int[] values = new int[size];
        temp = head;
        int i = 0;
    
        // Step 2 & 3: Store node values in the array
        while (temp != null) {
            values[i] = temp.val;
            temp = temp.next;
            i++;
        }
    
        int left = 0;
        int right = size - 1; // Corrected the initialization of the right pointer
    
        // Step 4: Calculate pair sums and keep track of the maximum sum
        while (left < right) {
            int sum = values[left] + values[right];
            max = Math.max(max, sum);
            left++;
            right--;
        }
    
        // Step 5: Return the maximum pair sum
        return max;
    }
}
