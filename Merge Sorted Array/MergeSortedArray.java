class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        for(int i = nums1.length - 1; i >= 0; i--){
            int valp1 = p1 >= 0 ?nums1[p1] : Integer.MIN_VALUE;
            int valp2 = p2 >= 0 ?nums2[p2] : Integer.MIN_VALUE;
            if(valp1 > valp2){
                nums1[i] = valp1;
                p1--;
            }
            else{
                nums1[i] = valp2;
                p2--;
            }
        }
   }
}
//TC:O(m+n),SC:O(1)