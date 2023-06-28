class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--){
            int curr = carry + digits[i];
            if(curr >= 10){
                carry = 1;
                digits[i] = curr % 10;
            }
            else{
                carry = 0;
                digits[i] = curr;
            }
        }
        if(carry == 1){
            int[] NewArray = new int[digits.length+1];
            NewArray[0] = 1;
            return NewArray;
        }
        return digits;
    }
}
//TC:O(n),SC:O(n)