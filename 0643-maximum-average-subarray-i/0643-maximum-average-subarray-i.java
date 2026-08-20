class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double sum=0;
        double avg=0;
        double maxx=0;
        int left=0;
        int right=0;
         while(right<k){
                sum+=nums[right];
                right++;
            }
            maxx=sum/k;
        while(right<nums.length){
            sum+=nums[right];
            sum-=nums[left];
            avg=sum/k;
            left++;
             right++;
            if(maxx<avg){
                maxx= Math.max(maxx,avg);
            }
        } 

        return maxx;     
    }
}