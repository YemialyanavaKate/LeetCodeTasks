import java.util.ArrayList;
import java.util.List;

public class LC_1431 {
    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extraCandies = 10;
        int max = 0;
        int n = candies.length;
        for (int i = 0; i < n; i++) {
            if(candies[i] > max){
                max = candies[i];
            }
        }
        List<Boolean> result= new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= max){
                result.add(true);
            } else {
                result.add(false);
            }
        }
        System.out.println(result);
    }
}
