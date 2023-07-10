class mergestringalternatively {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder newstr = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < word1.length() && j < word2.length()) {
            newstr.append(word1.charAt(i));
            newstr.append(word2.charAt(j));
            i++;
            j++;
        }

        while (i < word1.length()) {
            newstr.append(word1.charAt(i));
            i++;
        }

        while (j < word2.length()) {
            newstr.append(word2.charAt(j));
            j++;
        }

        return newstr.toString();
    }
}