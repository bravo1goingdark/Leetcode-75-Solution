public class subseq {
    public boolean isSubsequence(String s, String t) {
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        int left = 0;
        int right = 0;

        while (left < first.length && right < second.length) {
            if (first[left] == second[right]) {
                left++;
            }
            right++;
        }

        return left == first.length ? true : false;
    }
}
