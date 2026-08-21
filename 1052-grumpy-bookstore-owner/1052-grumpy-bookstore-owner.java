class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
      int r=0;
      int l=0;
      int sum=0;
      int sum1=0;
      for(r=0;r<minutes;r++){
        if(grumpy[r]==1){
        sum+=customers[r];
        }
      }  
      int maxx=sum;
      int l1=l;
      int r1=r;
      while(r<customers.length){
        if(grumpy[r]==1){
        sum+=customers[r];
        }
        if(grumpy[l]==1){
            sum-=customers[l];
        }
        if(maxx<sum){
            maxx=sum;
            l1=l;
            r1=r;
            
        }
        l++;
        r++;
      }
      for(int i=0;i<customers.length;i++){
        if(grumpy[i]==0)
        sum1+=customers[i];
      }

      return maxx+sum1;
    }
}