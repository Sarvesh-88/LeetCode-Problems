class Solution {
    public long countCommas(long n) {
      long totalCommas = 0;
        
        // Start at the first comma boundary (1,000) and multiply by 1,000 each step
        for (long limit = 1000; limit <= n; limit *= 1000) {
            totalCommas += (n - limit + 1);
        }
        
        return totalCommas;
    }
}