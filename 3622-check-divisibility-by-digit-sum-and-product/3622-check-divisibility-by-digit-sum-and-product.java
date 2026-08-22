class Solution {
    public boolean checkDivisibility(int j) {
        int sum=0;
        int mul=1;
        int n=j;
        while(n>0){
            sum+=(n%10);
            mul*=(n%10);
            n=n/10;
        }
        int ans=sum+mul;
        if((j%(ans))==0)
            return true;
        else
            return false;
    }
}