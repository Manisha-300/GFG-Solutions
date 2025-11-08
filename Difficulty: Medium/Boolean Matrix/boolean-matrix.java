class Solution {
    void booleanMatrix(int mat[][]) {
        // code here
        int r = mat.length;
        int c = mat[0].length;

        boolean[] row = new boolean[r];
        boolean[] col = new boolean[c];

        // Step 1: Mark rows and columns that have 1
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 1) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Step 2: Update cells
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (row[i] || col[j]) {
                    mat[i][j] = 1;
                }
            }
        }
    }
}