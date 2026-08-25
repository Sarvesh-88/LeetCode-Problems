class Solution {
    public int missingMultiple(int[] nums, int k) {
        int j=k;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
           arr.add(nums[i]);
        }
        for(j=k;j<=100;j+=k){
            if(!arr.contains(j))
                return j;
        }
        return j;
    }
}