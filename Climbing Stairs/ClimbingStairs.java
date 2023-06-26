class Solution {
    public int climbStairs(int n) {
       if(n == 1) return 1;
       if(n == 2) return 2;
       int[] num = new int[n];
       num[0]=1;
       num[1]=2;
       for(int i=2; i<n; i++){
           num[i]=num[i-1]+num[i-2];
       } 
       return num[n-1];
    }
}