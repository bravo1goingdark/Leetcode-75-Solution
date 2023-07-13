public class compress {
    public int compress(char[] chars) {
        if (chars == null || chars.length == 0) {
            return 0;
        }
        
        int index = 0;
        int count = 1;
        
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                chars[index++] = chars[i - 1];
                if (count > 1) {
                    String countStr = String.valueOf(count);
                    for (char c : countStr.toCharArray()) {
                        chars[index++] = c;
                    }
                }
                count = 1;
            }
        }
        
        chars[index++] = chars[chars.length - 1];
        if (count > 1) {
            String countStr = String.valueOf(count);
            for (char c : countStr.toCharArray()) {
                chars[index++] = c;
            }
        }
        
        return index;
    }
}
