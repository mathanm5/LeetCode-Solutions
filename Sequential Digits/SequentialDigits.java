class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String str = "123456789";
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 9; i++){
            for(int j = 0; i+j <= 9; j++){
                String temp = str.substring(j,i+j);
                int val = Integer.valueOf(temp);
                if(val >= low && val <= high){
                    list.add(val);
                }
            }
        }
        return list;
    }
}
//TC:O(9*9*9)=O(1), SC:O(1)