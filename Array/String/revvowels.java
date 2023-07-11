public class revvowels {
    public String reverseVowels(String s) {

        char[] res = s.toCharArray();
        int start = 0;
        int end = res.length - 1;

        while (end > start) {
            if (isVowel(res[start])) {
                while (end > start && !isVowel(res[end])) {
                    end--; // find the next vowel from the end
                }
                if (isVowel(res[end])) {
                    swap(res, start, end);
                    end--; // decrement end pointer
                }
            }
            start++;
        }
        return new String(res);
    }  

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e'|| c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E'|| c == 'I' || c == 'O' || c == 'U';
    }
    
    private void swap(char[] arr , int index1 , int index2){
        char temp = arr[index1];
        arr[index1] = arr[index2];;
        arr[index2] = temp;
    } 
    
}
