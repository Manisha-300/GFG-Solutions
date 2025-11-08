class Solution {
    public int romanToDecimal(String s) {
        // code here
         Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        // Step 2: Traverse the string
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));

            // If the next numeral is larger, subtract this one
            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                total -= value;
            } else {
                total += value;
            }
        }

        return total;
    }
}