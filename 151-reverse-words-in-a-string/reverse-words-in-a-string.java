class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split(" ");

        StringBuilder str = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].isEmpty()) {
                continue;
            }

            if (str.length() > 0) {
                str.append(" ");
            }

            str.append(words[i]);
        }

        return str.toString();
    }
}