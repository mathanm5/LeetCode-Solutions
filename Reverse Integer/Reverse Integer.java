class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        while(x != 0){
            int lastDigit = x % 10;
            if(reversed > max/10 || (reversed == max/10 && lastDigit > 7 )){
                return 0;
            }
            if(reversed < min/10 || (reversed == min/10 && lastDigit < -8)){
                return 0;
            }
            reversed = reversed * 10 + lastDigit;
            x = x/10;
        }
        return reversed;
    }
}
//TC:O(log n), SC:O(1)
//  2^31 = 2147483647
// -2^31 = -2147483568