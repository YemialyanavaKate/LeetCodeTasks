public class LC_1768 {
    public static void main(String[] args) {
        //String word1 = "ab";
        //String word2 = "pqrs";
        String word1 = "a";
        String word2 = "p";
        StringBuilder builder = new StringBuilder();
        int i = 0;
        int j = 0;
        while ( i < word1.length() && j < word2.length()) {
            builder.append(word1.charAt(i));
            builder.append(word2.charAt(j));
            i++;
            j++;
        }
        if (word1.length() > word2.length()) {
            builder.append(word1, word2.length(), word1.length());
        }
        if (word1.length() < word2.length()) {
            builder.append(word2, word1.length(), (word2.length()));
        }
        System.out.println(builder);
    }
}
