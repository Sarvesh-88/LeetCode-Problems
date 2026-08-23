class Solution {
    public boolean isPalindromic(String s) {
        int left=0;
        
        String br="";
            for(int i=0;i<s.length();i++){
                int a=s.charAt(i);
                String b=Integer.toBinaryString(a);
                while(b.length()<8){
                    b="0"+b;
                }
            br=br+b;
            }
        
        int right=br.length()-1;
        int check=0;
        while(left<right){
            if(br.charAt(left++)!=br.charAt(right--))
            {
                check++;
            }
            
        }
        if(check==0)
                return true;
            else
                return false;
    }
}