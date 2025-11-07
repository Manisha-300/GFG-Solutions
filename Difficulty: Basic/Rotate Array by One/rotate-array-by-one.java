// // User function Template for Java
import java.util.Arrays;
class Solution {
    public void rotate(int[] arr) {
        // code here
       int last = arr[arr.length - 1];
        
        // Shift all elements to the right by one position
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        
        // Place the last element at the beginning
        arr[0]  = last;
  
    }
}