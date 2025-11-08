class Solution {
    public void rearrange(int arr[]) {
        int n=arr.length;
         Arrays.sort(arr);

        int max_idx = n - 1;
        int min_idx = 0;
        int max_elem = arr[max_idx] + 1; // number greater than the maximum element

        // Step 2: Encode both old and new values
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Even index -> store maximum element
                arr[i] += (arr[max_idx] % max_elem) * max_elem;
                max_idx--;
            } else {
                // Odd index -> store minimum element
                arr[i] += (arr[min_idx] % max_elem) * max_elem;
                min_idx++;
            }
        }

        // Step 3: Decode the new values
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / max_elem;
        }
    
}
}