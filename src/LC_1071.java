public class LC_1071 {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        int num1;
        int num2;
        if (str1.length() >= str2.length()) {
            num1 = str1.length();
            num2 = str2.length();
        } else {
            num1 = str2.length();
            num2 = str1.length();
        }
        int i = 0;
        if (
            //Objects.equals(str1.charAt(i), str2.charAt(i))
                str1.charAt(i) == str2.charAt(i)) {
            i++;
        }
        if (i == 0) {
            System.out.println("");
        }

        int gcdLength = gcd (num1,num2);
        System.out.println(str1.substring(0,gcdLength));

    }
    private static  int gcd (int num1, int num2){
    return num2 == 0 ? num1 : gcd(num2, num1 % num2);
}
}
