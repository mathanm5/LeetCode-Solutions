class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack = new Stack<>();
        for(int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                char pop = stack.size() != 0 ? stack.pop() : '#';
                if(pop != map.get(ch)){
                    return false;
                }
            }
            else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
//TC:O(n), SC:O(n)