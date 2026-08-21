class Solution {
    public int maxVowels(String s, int k) {
        
        int r=0;
        int l=0;
        int count=0;
        int maxx=Integer.MIN_VALUE;
       for(r=0;r<k;r++){
        if(s.charAt(r)=='a'||s.charAt(r)=='e'||s.charAt(r)=='i'||s.charAt(r)=='o'||s.charAt(r)=='u') {
            count++;
            }
            maxx=count;
       }
        while(r<s.length()){
            if(s.charAt(r)=='a'||s.charAt(r)=='e'||s.charAt(r)=='i'||s.charAt(r)=='o'||s.charAt(r)=='u'){
                count++;
                

            }
             if(s.charAt(l)=='a'||s.charAt(l)=='e'||s.charAt(l)=='i'||s.charAt(l)=='o'||s.charAt(l)=='u'){
                count--;
             }
             maxx=Math.max(maxx,count);
            l++;
            r++;
        }
        return maxx;
    }
}