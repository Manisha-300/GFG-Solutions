class Solution {
    void selectionSort(int[] arr) {
        // code here
         int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;

        // Find the index of the smallest element in the remaining array
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        

        // Swap with the first element of the unsorted part
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
    }
}