// User function Template for Java
class Solution {
    String merge(String S1, String S2) {
        // code here
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < S1.length() || i < S2.length()) {
            if (i < S1.length()) sb.append(S1.charAt(i));
            if (i < S2.length()) sb.append(S2.charAt(i));
            i++;
        }
        return sb.toString();
    }
}