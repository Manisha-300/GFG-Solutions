// User function Template for Java
class Solution {
    boolean metaStrings(String s1, String s2) {
        // code here
          if (s1.length() != s2.length())
            return false;

        // If both strings are equal, they are not meta strings
        if (s1.equals(s2))
            return false;

        int n = s1.length();
        int first = -1, second = -1;
        int count = 0;

        // Find mismatched positions
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count == 1)
                    first = i;
                else if (count == 2)
                    second = i;
                else
                    return false; // more than 2 mismatches → not meta strings
            }
        }

        // There must be exactly 2 mismatches, and swapping makes them equal
        return (count == 2 &&
                s1.charAt(first) == s2.charAt(second) &&
                s1.charAt(second) == s2.charAt(first));
    }
}
