// User function Template for Java

class Solution {
    int countZeroes(int[] arr) {
        // code here
        int n=arr.length;
        int left = 0, right = n - 1;
        int firstZero = n;  // assume no zero initially

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == 0) {
                firstZero = mid; 
                right = mid - 1;  // go left for the first zero
            } else {
                left = mid + 1;   // go right
            }
        }

        return n - firstZero;  
    }
}
