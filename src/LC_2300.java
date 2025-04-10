import java.util.Arrays;

public class LC_2300 {
    public static void main(String[] args) {
        int[] spells = {3,1,2};
        int[] potions = {8,5,8};
        int success = 16;
        double k;
        int[] pairs = new int[spells.length];
        int j = 0;
        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            k =  (double) success / spells[i];
                while (j < potions.length && potions[j] < k){
                    j++;
                }
            pairs[i] = potions.length - j;
                j = 0;
            }

        System.out.println(Arrays.toString(pairs));
        }
    }

