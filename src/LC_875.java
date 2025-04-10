public class LC_875 {
    public static void main(String[] args) {
        int [] piles = {805306368,805306368,805306368};
        int h = 1000000000;
        int k;
        int min = 1;
        int max = 1000000000;

        while (min <= max) {
            k = min + (max - min) / 2;
            if (canEatInTime(piles,k,h)){
                max = k - 1;
            } else {
                min = k + 1;
            }
        }

        System.out.println(min);
    }
    public static boolean canEatInTime(int piles[], int k, int h){
        long hours = 0;
        for(int pile : piles){
            int div = pile / k;
            hours += div;
            if(pile % k != 0) {
                hours++;
            }
        }
        return hours <= h;
    }
}
