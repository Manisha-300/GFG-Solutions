import java.util.Arrays;
class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        if(a.length!=b.length){
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        
      boolean r=Arrays.equals(a,b);
      if(r){
          return true;
      }
     
        else{
            return false;
        }
    }
}