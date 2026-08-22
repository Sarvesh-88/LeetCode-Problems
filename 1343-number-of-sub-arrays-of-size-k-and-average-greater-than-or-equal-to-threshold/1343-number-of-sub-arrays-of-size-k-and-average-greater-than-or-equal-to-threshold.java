class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int right=0;
        int left=0;
        int count=0;
        int sum=0;
        // yeh phla block for wala hume phle subarray ke sum ko dega....
        for(right=0;right<k;right++){
            sum+=arr[right];
        }
        // yeh check krega ki threshold sy bada h ki nhi bada hoga count badhega....
        if((sum/k)>=threshold){
            count++;
        }
        //yeh array ke aage ke subarray ke sum ke averages check krke count badhayega....
        for(right=k;right<arr.length;right++){
            sum+=arr[right];
            sum-=arr[left++];
            if((sum/k)>=threshold){
        // count badhega....
                count++;
            }
        }
        return count;
    }
}