class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx <= 0) return word; // -1 or 0 -> nothing to change or single char prefix
        char[] a = word.toCharArray();
        int i = 0, j = idx;
        while (i < j) {
            char tmp = a[i];
            a[i++] = a[j];
            a[j--] = tmp;
        }
        return new String(a);
    }
}
