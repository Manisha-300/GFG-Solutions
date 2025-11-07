class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
   List<Integer> list = new ArrayList<>();
        for (int x : arr) if (x < a) list.add(x);
        for (int x : arr) if (x >= a && x <= b) list.add(x);
        for (int x : arr) if (x > b) list.add(x);
        for (int i = 0; i < arr.length; i++) arr[i] = list.get(i);
    }
}