class Solution {
    public int firstMissingPositive(int[] nums) {
        //PreProcess
        for(int i = 0; i < nums.length; i++){
           if(nums[i] < 0 || nums[i] == 0){
               nums[i] = nums.length + 1;
           } 
        }
        //Marking
        for(int i = 0; i<nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(index < nums.length && nums[index] > 0){
                nums[index] = -1 * nums[index];
            }
        }
        //Scan
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0){
                return i+1;
            }
        }
        return nums.length + 1; //1,2,3,4,5(all are marked)...arraylength+1
    }
}
//TC:O(3*n)=O(n), SC:O(1)