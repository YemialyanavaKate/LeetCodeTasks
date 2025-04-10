public class LC_151 {
    public static void main(String[] args) {
        String s = "a good   example";
        s = s.trim();
        int length = s.length();
        String reverseWords = "";
        int t;
        while (length != 0){
            t = 0;
            while (length != 0 && s.charAt(length - 1) != ' ') {
                length--;
                t++;
            }
            String word = s.substring(length, length + t);
            if(!word.isEmpty()) {
                reverseWords = String.format("%s%s%s", reverseWords, word, " ");

            }
            if (length != 0) {
                length--;
            }
        }
        System.out.println(reverseWords.trim());
    }
}
