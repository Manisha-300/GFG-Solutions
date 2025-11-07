class Solution {
    public String reverseWords(String s) {
        // Code here
          List<String> list = new ArrayList<>(Arrays.asList(s.split("\\.+")));
        list.removeIf(String::isEmpty);
        Collections.reverse(list);
        return String.join(".", list);
    }
}
