public class LC_605 {
    public static void main(String[] args) {
        int[] flowerbed = {1};
        int n = 0;
        int l = flowerbed.length;
        boolean x;
        if (n == 0){
            x = true;
        }
        if (l == 1 && n == 1 && flowerbed[0] == 0){
            x = true;
        } else if (l == 1){
            x = false;
        }
        if (l == 2 && n == 1 && (flowerbed[0] == 0 && flowerbed [1] == 0)){
            x = true;
        } else if (l == 2){
            x = false;
        }
        if (flowerbed[0] == 0 && flowerbed[1] == 0 ){
            flowerbed[0] = 1;
            n--;
        }
        for (int i = 1; i < l - 1; i++) {
            if (flowerbed [i] == 0 && flowerbed [i - 1] == 0 && flowerbed[i+1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        if (flowerbed[l - 1] == 0 && flowerbed[l - 2] == 0){
            n--;
        }
        if (n <= 0){
            x = true;
        } else {
            x = false;
        }
        System.out.println(x);
    }
}
