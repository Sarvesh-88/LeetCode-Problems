class Solution {
    public int[] twoSum(int[] nums, int target) {
        // ArratList<Integer> arr=new ArrayList<>();

        // for(int i=0;i<nums.length;i++){
        //         if(1<i&&i<10)
        //         {
        //             sum=nums[i]*10+i;
        //             arr.add(sum);
        //         }
        //         if(10<=i&& i<100){
        //             sum=nums[i]*10+i;
        //             arr.add(sum);
        //         }
        //         if(100<=i && i<1000){
        //             sum=nums[i]*100+i;
        //             arr.add(sum);
        //         }
        //         if(1000<=i && i<10000){
        //             sum=num[i]*1000+i;
        //             arr.add(sum);
        //         }
        //         if(i==10000){
        //             sum=nums[i]*10000+i;
        //         }
        // }

        // for(int j=0;j<nums;j++){
            
        // }

        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            
            map.put(nums[i], i);
        }
        
        return new int[] {};
       
    }
}