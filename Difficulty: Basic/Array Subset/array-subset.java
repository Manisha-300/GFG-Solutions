
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
         // Frequency map for array a
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int x : a) {
        map.put(x, map.getOrDefault(x, 0) + 1);
    }

    // Check elements of b
    for (int x : b) {
        if (!map.containsKey(x) || map.get(x) == 0) {
            return false; // element missing or insufficient frequency
        }
        map.put(x, map.get(x) - 1);
    }

    return true;

    }
}
