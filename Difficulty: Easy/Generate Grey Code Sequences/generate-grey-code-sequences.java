/*Returns an array of all n-bit gray codes sequence.
You are required to complete below method. */
class Solution {
    ArrayList<String> generateCode(int n) {
        // Your code here
         ArrayList<String> result = new ArrayList<>();

        // Base case
        if (n <= 0) {
            return result;
        }
        result.add("0");
        result.add("1");

        // Generate codes for each number of bits
        for (int i = 2; i <= n; i++) {
            int size = result.size();

            // Step 1: Reverse and append with '1'
            for (int j = size - 1; j >= 0; j--) {
                result.add(result.get(j));
            }

            // Step 2: Prefix '0' to first half
            for (int j = 0; j < size; j++) {
                result.set(j, "0" + result.get(j));
            }

            // Step 3: Prefix '1' to second half
            for (int j = size; j < 2 * size; j++) {
                result.set(j, "1" + result.get(j));
            }
        }

        return result;
    }
}