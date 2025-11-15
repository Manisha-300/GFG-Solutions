class Solution {
    static void relativeSort(int[] a1, int[] a2) {
        // code here
          Map<Integer, Integer> count = new HashMap<>();
        for (int num : a1) count.put(num, count.getOrDefault(num, 0) + 1);

        int idx = 0;
        // Place elements according to a2
        for (int num : a2) {
            while (count.containsKey(num) && count.get(num) > 0) {
                a1[idx++] = num;
                count.put(num, count.get(num) - 1);
            }
        }

        // Place remaining elements in ascending order
        List<Integer> rem = new ArrayList<>();
        for (int num : count.keySet()) {
            int c = count.get(num);
            for (int i = 0; i < c; i++) rem.add(num);
        }
        Collections.sort(rem);
        for (int num : rem) a1[idx++] = num;

       
    

    }
}