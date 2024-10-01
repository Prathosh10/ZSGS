class Solution {
    public int maxVowels(String s, int k) {
        int maxLen = 0;

        int i = 0, j = s.length(), index = 0;
        int count = 0;

        while (i < j) {
            char ch = s.charAt(i);

            if (i - index >= k) {
                char t = s.charAt(index);
                if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u') {
                    count--;
                }
                index++;
            }

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

            maxLen = Math.max(maxLen, count);
            i++;
        }

        return maxLen;
    }
}
