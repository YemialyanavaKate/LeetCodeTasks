public class LC_345 {
    public static void main(String[] args) {
        String s = "A man, a plan, a cameo, Zena, OEM, a canal, Panama! ";
        char buffer;
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        boolean answer = false;
        while ( i < j) {
            do {
                if ( arr[i] == 'a' || arr[i] == 'A' ||
                        arr[i] == 'e' || arr[i] == 'E' ||
                        arr[i] == 'i' || arr[i] == 'I' ||
                        arr[i] == 'o' || arr[i] == 'O' ||
                        arr[i] == 'u' || arr[i] == 'U') {
                    answer = true;
                }else {
                    i++;
                }
            } while (!answer && i < j);


            answer = false;
                do {
                    if (arr[j] == 'a' || arr[j] == 'A' ||
                            arr[j] == 'e' || arr[j] == 'E' ||
                            arr[j] == 'i' || arr[j] == 'I' ||
                            arr[j] == 'o' || arr[j] == 'O' ||
                            arr[j] == 'u' || arr[j] == 'U' ) {
                        answer = true;
                        buffer = arr[i];

                        arr[i] = arr[j];
                        arr[j] = buffer;
                    } else {
                        j--;
                    }
                } while (!answer && i < j);
            i++;
            j--;
            answer = false;
            }
        String str = String.valueOf(arr);
        /*for (int i = 0; i < s.length(); i++) {
            do {
                c1 = s.charAt(i);
            } while (c1 == 65 || c1 == 97 ||
                c1 == 69 || c1 == 101 ||
                c1 == 73 || c1 == 105 ||
                c1 == 79 || c1 == 111 ||
                c1 == 85 || c1 == 117)
            {
                left = c1;
            }
            for (int j = i + 1; j < s.length() ; j++) {
                int c2 = s.charAt(i);
                if (c2 == 65 || c2 == 97 ||
                        c2 == 69 || c2 == 101 ||
                        c2 == 73 || c2 == 105 ||
                        c2 == 79 || c2 == 111 ||
                        c2 == 85 || c2 == 117){
                    right = c2;
                }
            }
        }*/
        System.out.println(str);
    }
}
