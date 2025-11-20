// User function Template for Java

class Solution {
    void diagonalSort(int matrix[][], int n, int m) {

        // ---- LOWER LEFT TRIANGLE (ascending) ----
        for (int start = 1; start < n; start++) {
            ArrayList<Integer> diag = new ArrayList<>();
            int r = start, c = 0;

            // collect diagonal
            while (r < n && c < m) {
                diag.add(matrix[r][c]);
                r++; 
                c++;
            }

            // sort ascending
            Collections.sort(diag);

            // write back
            r = start;
            c = 0;
            int idx = 0;
            while (r < n && c < m) {
                matrix[r][c] = diag.get(idx++);
                r++;
                c++;
            }
        }

        // ---- UPPER RIGHT TRIANGLE (descending) ----
        for (int start = 1; start < m; start++) {
            ArrayList<Integer> diag = new ArrayList<>();
            int r = 0, c = start;

            // collect diagonal
            while (r < n && c < m) {
                diag.add(matrix[r][c]);
                r++; 
                c++;
            }

            // sort descending
            Collections.sort(diag, Collections.reverseOrder());

            // write back
            r = 0;
            c = start;
            int idx = 0;
            while (r < n && c < m) {
                matrix[r][c] = diag.get(idx++);
                r++;
                c++;
            }
        }
    }
}
