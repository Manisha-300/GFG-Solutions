// User function Template for Java

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
         HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(x);
        }

        for (int i = A; i <= B; i++) {
            if (!set.contains(i)) {
                return false; 
            }
        }

        return true;
    }
}
