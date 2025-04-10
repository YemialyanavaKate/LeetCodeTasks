public class LC_1456 {
    public static void main(String[] args) {
        String s = "aeiou";
        int k = 2;
        int counter = 0;
        int max;
        int i;
        String str = s.substring(0,k);
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' ||
                    str.charAt(i) == 'e' || str.charAt(i) == 'E' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'I' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'O' ||
                    str.charAt(i) == 'u' || str.charAt(i) == 'U' ) {

                counter++;
                    }
            }
       max = counter;
        i = 0;
       for (int j = k; j < s.length() ; j++){

           if (s.charAt(i) == 'a' || s.charAt(i) == 'A' ||
                   s.charAt(i) == 'e' || s.charAt(i) == 'E' ||
                   s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
                   s.charAt(i) == 'o' || s.charAt(i) == 'O' ||
                   s.charAt(i) == 'u' || s.charAt(i) == 'U'  ) {
               counter--;
           }

           if (s.charAt(j) == 'a' || s.charAt(j) == 'A' ||
                   s.charAt(j) == 'e' || s.charAt(j) == 'E' ||
                   s.charAt(j) == 'i' || s.charAt(j) == 'I' ||
                   s.charAt(j) == 'o' || s.charAt(j) == 'O' ||
                   s.charAt(j) == 'u' || s.charAt(j) == 'U' ) {
               counter++;
           }
           if (counter > max){
               max = counter;
           }
           i++;
       }
        System.out.println(max);
    }
}
