class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            n = SumOfSquares(n);
        }
        return true;
    }
    public int SumOfSquares(int n){
        int sum=0;
        while(n > 0){
            int lastDigit = n%10;
            sum += lastDigit * lastDigit;
            n /= 10;
        }
        return sum;
    }
}
//TC:O(log n), SC:O(log n)