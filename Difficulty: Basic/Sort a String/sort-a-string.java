// User function Template for Java
class Solution {
    String sort(String s) {
        // code here
       char[] chars = s.toCharArray();
    
  
    Arrays.sort(chars);
    
   
    return new String(chars);
    }
}