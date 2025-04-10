import java.util.Arrays;

public class LC_338 {
    // Работает
    /*public static void main(String[] args) {
        int n = 63;
        int[] ans = new int[n + 1];
        int x;
        int count = 0;
        int y;
        for (int i = 0; i <= n; i++) {
            x = i;
             do {
                 y = x % 2;
                if (y == 1 ) {
                    count++;
                }
                x = x / 2;
             } while (x  > 0);
             ans[i] = count;
             count = 0;
        }
        System.out.println(Arrays.toString(ans));
    }*/
    public static void main(String[] args) {
        int n = 5;
        String str;
        StringBuilder builder = new StringBuilder();
        int[] ans = {0,1,1,2};
        int length;
        int z;
        for (int i = 4; i <= n; i++) {
            //length = ans.length;
            //z = length / 2;
            z =  i / 2;
            builder.append(Arrays.toString(ans));

            while (i - 1 - z != 1 ) {
                builder.append(builder.substring(z, i - 1));
               // z =
            }

            i = i * 2;

        }
    }
}
