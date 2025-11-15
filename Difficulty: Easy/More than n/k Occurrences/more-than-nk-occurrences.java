class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
          int n = arr.length;
    HashMap<Integer, Integer> map = new HashMap<>();

    // Count frequencies
    for (int x : arr) {
        map.put(x, map.getOrDefault(x, 0) + 1);
    }

    int cnt = 0;
    int limit = n / k;

    // Count elements occurring more than n/k times
    for (int key : map.keySet()) {
        if (map.get(key) > limit) {
            cnt++;
        }
    }

    return cnt;
    }
}