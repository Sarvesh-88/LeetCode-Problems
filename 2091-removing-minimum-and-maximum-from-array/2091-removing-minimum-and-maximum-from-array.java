class Solution {
    public int minimumDeletions(int[] nums) {
        int i = 0, j = 0, n = nums.length;
        
       
        for (int k = 0; k < n; k++) {
            if (nums[k] < nums[i]) i = k;
            if (nums[k] > nums[j]) j = k;
        }
        
        
        int left = Math.min(i, j);
        int right = Math.max(i, j);
        
      
        return Math.min(right + 1, Math.min(n - left, left + 1 + n - right));
    }
}