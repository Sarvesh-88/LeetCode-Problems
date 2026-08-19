class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxx=0;
        int []charIdx=new int[128];
        Arrays.fill(charIdx,-1);
        int left=0;

        for(int right=0;right<n;right++){
            if(charIdx[s.charAt(right)]>=left)
                left=charIdx[s.charAt(right)]+1;
            charIdx[s.charAt(right)]=right;
            maxx=Math.max(maxx,right-left+1);
        }
        return maxx;
    }

}