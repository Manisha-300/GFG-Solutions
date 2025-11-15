class GfG {
    /*you are required to complete this method*/
    int countZeros(int A[][], int N) {
        // Your code here
        int row = 0, col = N - 1;
        int count = 0;

        while (row < N && col >= 0) {
            if (A[row][col] == 0) {
                // All elements from 0 to col are zeros
                count += (col + 1);
                row++; // move to next row
            } else {
                col--; // move left
            }
        }

        return count;
    }
}