class Solution {
    public int maxWater(int arr[]) {
        // Code Here
         int l = 0, r = arr.length - 1, res = 0;
        while (l < r) {
           int min =(r - l) * Math.min(arr[l], arr[r]);
           res=Math.max(res,min);
            if (arr[l] < arr[r]) l++;
            else r--;
        }
        return res;
    }
}