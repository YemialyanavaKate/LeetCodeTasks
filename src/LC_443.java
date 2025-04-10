public class LC_443 {
    public static void main(String[] args) {
        //char[] chars = {'a','a','b','b','c','c','c'};
        //char[] chars = {'a','a','a','b','b','a','a'};
        //char[] chars = {'a'};
        //char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        //char[] chars = {'a','a'};
        //char[] chars = {'o','o','o','o','o','o','o','o','o','o'};
        char[] chars = {'w','w','w','w','w','b','b','g','g','g','g','a','a','a','i','i','i','i','y','y','p','v','v','v','u','u','u','y','y','y','y','y','y','y','y','y','s','q','q','q','q','q','q','q','q','q','q','n','n','n'};

        System.out.println(compress(chars));
        System.out.println(chars);
    }

    public static int compress(char[] chars) {
        int i;
        int k;
        int last = 0;
        String s ="";
        if (chars.length == 0 || chars.length == 1){
            return chars.length;
        }
        for (i = 0; i < chars.length; i++) {
                chars[last] = chars[i];
            last++;
            k = 1;
            while (i < chars.length - 1 && chars[i] == chars[i + 1]){
                k++;
                i++;
            }

            if ((k > 1 && k < 10 && (i == chars.length - 1)) || (k > 1 && k < 10 && (chars[i] != chars[i + 1]))){
                chars[last] = Character.forDigit(k,10);
                last++;
            }if (((k >= 10 && (i == chars.length - 1)) || (k >= 10 && (chars[i] != chars[i + 1])))){
                s = Integer.toString(k);
                int j = 0;
                while (j < s.length()){
                    chars[last] = s.charAt(j);
                    j++;
                    last++;
                }
            }
        }
        return last;
    }
}
