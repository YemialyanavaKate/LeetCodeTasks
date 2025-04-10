public class LC_374 {
    public static void main(String[] args) {
        int n = 2;
        int right = n;
        int leght = 1;

        if (n == 1){
            System.out.println(1);
        }
        int y = guess(n);
        if (y == 0){
            System.out.println(n);
        }
        int num = n / 2 + 1;
        y = guess(num);
        do {
            if (y == -1){
                leght = num;
            } else if (y == 1){
                right = num;
            }
            num = (right - leght) / 2 + leght;
            y = guess(num);
        } while (y != 0);
        System.out.println(num);
    }
    public static int guess(int num){
        int x = 2;
        if(num > x){
            return 1;
        }
        if(num < x){
            return -1;
        } else
        return 0;
    }
    //отправляла
    /*if (n == 1){
        return 1;
    }
    int num = n / 2 + 1;
    int y = guess(num);
        do {
        if (y == -1 ){
            num = num / 2 + 1;
        } else if (y == 1){
            num = (n - num) / 2 + num + 1;
        }
        y = guess(num);
    } while (y != 0);
        return num;*/
}
