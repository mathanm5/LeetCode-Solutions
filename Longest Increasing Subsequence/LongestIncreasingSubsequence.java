class Solution {
    public int lengthOfLIS(int[] nums) {
       List<Integer> list =  new ArrayList<Integer>();
       list.add(nums[0]);
       for(int i = 1; i < nums.length; i++){
           int curr = nums[i];
           if(curr > list.get(list.size()-1)){
               list.add(nums[i]);
           }
           else{
               int bsa = binSearch(list, nums[i]);
               list.set(bsa,nums[i]);
           }
       }
       return list.size();   
    }
    public int binSearch(List<Integer> list, int val){
        int left  = 0;
        int right = list.size() - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(val > list.get(mid)){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return right;
    }
}
//TC:O(n log n), SC:O(n)