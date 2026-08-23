class Solution {
    public int missingNumber(int[] nums) {
        int big=0;
        int total=0;
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            big=Math.max(nums[i],big);
        }
        if(nums.length==big+1){
            return big+1;
        }
        total=(big*(big+1))/2;
        return total-sum;
    }
}