class Solution {
    public int romanToInt(String s) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int currentValue = map.get(current);
            
            // Check if there is a next character and its value is greater
            if (i < s.length() - 1) {
                char next = s.charAt(i + 1);
                int nextValue = map.get(next);
                
                if (nextValue > currentValue) {
                    count -= currentValue; // Subtract current value
                    continue; // Skip to the next iteration
                }
            }
            
            count += currentValue;
        }
        
        return count;
    }
}