import java.util.Arrays;

public class LC_2300_Best {
    public static void main(String[] args) {
        int[] spells = {15,8,19};
        int[] potions = {38,36,23};
        int success = 328;
        double k;
        int[] pairs = new int[spells.length];

        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            k = Math.ceil ((double) success / spells[i]);
            int index = binarySearch(potions, (int)k);

            if (index != -1) {
                pairs[i] = potions.length - index;
            }
        }
        System.out.println(Arrays.toString(pairs));
        }
        private static int binarySearch(int[] arr, int k){

        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (left == right && left == mid && arr[mid] < k) {
                result = mid + 1;
            } else {
                result = mid;
            }
            if (arr[mid] == k) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < k){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
        }
    }

