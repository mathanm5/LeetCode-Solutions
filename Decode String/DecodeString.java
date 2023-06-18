class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for(int i = 0;i < len; i++){
            char ch = s.charAt(i);
            //Case1 : Number
            if(Character.isDigit(ch)){
                int num = ch - '0';//converting into ASCII Value
                while(i+1 < len && Character.isDigit(s.charAt(i+1))){
                    num = num * 10 + s.charAt(i+1) - '0';
                    i++;
                }
                numStack.push(num);
            }
            //Case2 : Opening Bracket '['
            else if(ch == '['){
                strStack.push(sb.toString());
                sb = new StringBuilder();
            }
            //Case3 : Closing Bracket ']'
            else if(ch == ']'){
                int k = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for(int j=0; j < k; j++){
                    temp.append(sb);
                }
                sb = temp;
            }
            //Case4 : Other Than this any input came directly add it to the sb
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
//TC: O(n*k), SC:O(4n)~ O(n)