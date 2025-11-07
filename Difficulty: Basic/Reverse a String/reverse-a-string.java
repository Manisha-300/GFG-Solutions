// User function Template for Java
import java.util.Arrays;
class Solution {
    public static String reverseString(String s) {
        // code here
         if (s == null || s.length() <= 1) {
            return s;
        }
        int l=0,r=s.length()-1;
        char[] ch= s.toCharArray();
        
        
        
        while(l<r){
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]= temp;
            l++;
            r--;

        }
       return new String(ch);
    }
}