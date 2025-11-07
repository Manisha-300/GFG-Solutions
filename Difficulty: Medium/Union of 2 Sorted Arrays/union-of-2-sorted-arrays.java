class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
         HashSet<Integer> set = new HashSet<>();

        // Add all elements from both arrays
        for (int num : a) set.add(num);
        for (int num : b) set.add(num);

        // Convert to list and sort
        ArrayList<Integer> union = new ArrayList<>(set);
        Collections.sort(union);

        return union;
    }
}
