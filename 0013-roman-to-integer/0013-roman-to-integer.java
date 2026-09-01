class Solution {
    public int romanToInt(String s) {
        int sum=0;
        int arr[]=new int[s.length()];
        int I   =  1;
        int V   =  5;
        int X   =  10;
        int L   =  50;   
        int C   =  100;
        int D   =  500;
        int M   =  1000;

        for(int j=0;j<arr.length;j++){
            if(s.charAt(j)=='I'){
                arr[j]=I;
            }
            else if(s.charAt(j)=='V'){
                arr[j]=V;
            }
            else if(s.charAt(j)=='X'){
                arr[j]=X;
            }
            else if(s.charAt(j)=='L'){
                arr[j]=L;
            }
            else if(s.charAt(j)=='C'){
                arr[j]=C;
            }
            else if(s.charAt(j)=='D'){
                arr[j]=D;
            }
            else if(s.charAt(j)=='M'){
                arr[j]=M;
            }
        }

        for(int i=0;i<arr.length;i++){
           if(i<arr.length-1&&arr[i]<arr[i+1]){
            sum-=arr[i];
           }
          
           else
            sum+=arr[i];
        }
        return sum;
        
        
    }
}