class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i<flowerbed.length; i++){
            if(flowerbed[i] == 0){
            boolean left = (i-1 < 0 || flowerbed[i-1] == 0);
            boolean right =(i+1 >= flowerbed.length || flowerbed[i+1] == 0);
            if(left && right){
                count++;
                flowerbed[i] = 1;
                }
        }
        
        }
        return count >= n;
    }
}
//TC:O(n),SC:O(1)