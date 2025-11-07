// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
     String pre = arr[0];
        for (int i = 1; i < arr.length; i++)
            while (!arr[i].startsWith(pre))
                pre = pre.substring(0, pre.length() - 1);
        return pre;   
    }
}