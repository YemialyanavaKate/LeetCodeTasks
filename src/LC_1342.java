public class LC_1342 {
    public static void main(String[] args) {
        int num = 14;
        int step = 0;
        while (!(num == 0)){
            int x = num % 2;
            if (x == 0){
                num = num / 2;
            } else {
                num--;
            }
            step++;

        } ;
        System.out.println(step);

    }
}
