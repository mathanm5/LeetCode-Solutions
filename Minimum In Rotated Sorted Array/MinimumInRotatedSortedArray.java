class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.min(nums[0], nums[1]);
        if(nums[0] < nums[nums.length - 1]) return nums[0];
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            //checking whether it is decreased in mid+1:
            if(nums[mid+1] < nums[mid])
               return nums[mid+1];
            //checking whether it is decreased in mid:
            if(nums[mid-1] > nums[mid])
               return nums[mid];
            //discarding the increasing order:
            if(nums[left] < nums[mid])
                 left = mid+1;
             else
                right = mid-1;
        }
        return 0;
    }
}
//TC:O(log n), SC:O(1)