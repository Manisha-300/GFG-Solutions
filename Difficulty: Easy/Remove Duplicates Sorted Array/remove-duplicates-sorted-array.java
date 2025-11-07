class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
         ArrayList<Integer> result = new ArrayList<>();
    HashSet<Integer> seen = new HashSet<>();
    
    for (int num : arr) {
        if (!seen.contains(num)) {
            result.add(num);
            seen.add(num);
        }
    }
    return result;
    }
}
