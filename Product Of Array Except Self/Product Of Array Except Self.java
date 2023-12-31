class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] PrefixProduct = new int[nums.length];
        PrefixProduct[0] = 1;
        for(int i=1;i< nums.length;i++){
            PrefixProduct[i] = PrefixProduct[i-1] * nums[i-1];
        }
        int SuffixProduct=1;
        for(int i=nums.length-1;i>=0;i--){
            PrefixProduct[i] = PrefixProduct[i] * SuffixProduct;
            SuffixProduct=SuffixProduct * nums[i];
        }
        return PrefixProduct;
        
    }
}
