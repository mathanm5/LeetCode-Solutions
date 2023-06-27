class Solution {
    public boolean canJump(int[] nums) {
        int destination = 0;
        for(int i = 0; i < nums.length && i <= destination; i++){
            destination = Math.max(destination, i+nums[i]);
            if(destination >= nums.length-1){
                return true;
            }
        }
        return false;
    }
}
//TC:O(n), SC:O(1)