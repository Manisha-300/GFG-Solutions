// User function Template for Java

class Solution {
    Long maxTripletProduct(Long arr[], int n) {
        Arrays.sort(arr);

        long prod1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
        long prod2 = arr[0] * arr[1] * arr[n - 1];

        return Math.max(prod1, prod2);
    }
}