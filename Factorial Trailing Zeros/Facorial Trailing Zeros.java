class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        for(int i=5 ; i<=n; i=i*5){
            count = count + n/i;
        }
        return count;
    }
}
//TC:O(log5(n)), SC:O(1)