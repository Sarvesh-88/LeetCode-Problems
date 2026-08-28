class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;

        while (true) {
            
            int smallest = Integer.MAX_VALUE;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > 0 && nums[j] < smallest) {
                    smallest = nums[j];
                }
            }

            
            if (smallest == Integer.MAX_VALUE) {
                break;
            }

           
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > 0) {
                    nums[j] -= smallest;
                }
            }

           
            count++;
        }

        return count;
    }
}