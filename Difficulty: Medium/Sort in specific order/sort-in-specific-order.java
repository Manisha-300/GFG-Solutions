class Solution {
    public void sortIt(int[] arr) {
        // code here
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        // Separate odd and even numbers
        for (int x : arr) {
            if (x % 2 == 0)
                even.add(x);
            else
                odd.add(x);
        }

        // Sort odd in descending order
        Collections.sort(odd, Collections.reverseOrder());

        // Sort even in ascending order
        Collections.sort(even);

        // Merge back into original array
        int index = 0;
        for (int x : odd) arr[index++] = x;
        for (int x : even) arr[index++] = x;
        
    }
}
