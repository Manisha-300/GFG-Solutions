class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
         int n = mat.length;
        if (n == 0) return false;
        int m = mat[0].length;
        
        int low = 0, high = n * m - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Convert 1D mid to 2D indices
            int i = mid / m;
            int j = mid % m;
            
            if (mat[i][j] == x) return true;
            else if (mat[i][j] < x) low = mid + 1;
            else high = mid - 1;
        }
        
        return false;
    }
}
