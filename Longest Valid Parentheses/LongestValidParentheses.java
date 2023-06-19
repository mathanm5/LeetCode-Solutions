class Solution {
    public int longestValidParentheses(String s) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);//Creating Boundry
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.size() == 0){
                    stack.push(i); //Updating New Boundry
                }
                else{
                    //Part of Valid Parentheses
                    ans = Math.max(ans, i - stack.peek());
                }
            }
        }
        return ans;
    }
}
//TC:O(n), SC:O(n)