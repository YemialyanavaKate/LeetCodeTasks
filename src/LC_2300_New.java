import java.util.Arrays;

public class LC_2300_New {
    public static void main(String[] args) {
        int[] spells = {36,36,22,11,35,21,4,25,30,35,31,10,8,39,7,22,18,9,23,30,9,37,22,7,36 ,40,17,37,38,27,6,15,1,15,7,31,36,29,9,15,3,37,15,17,25,35,9,21,5,17,25,8,18,25,7,19,4,33,9,5,29, 13,9,18,5,10,31,6,7,24,13,11,8,19,2};
        int[] potions = {30,11,5,20,19,36,39,24,20,37,33,22,32,28,36,24,40,27,36,37,38,23,39,11,40 ,19,37,32,25,29,28,37,31,36,32,40, 38,22,17,38,20,33,29,17,36,33,35,25,28,18,17,19,40,27,40,28,40,40,40,39,17, 34,36,11,22,29,22,35,35,22,18,34};
        int success = 135;
        double k;
        int[] pairs = new int[spells.length];
        //int j = 0;

        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            k = Math.ceil ((double) success / spells[i]);
            int index = binarySearch(potions, (int)k, 0, potions.length - 1);

            /*if (index < 0) {
                do {
                    k++;
                    index = binarySearch(potions, (int) k, 0, potions.length - 1);
                } while (index < 0);
            //} else if (index >= 0){
            }*/
            if (index != -1) {
                pairs[i] = potions.length - index;
            }
        }
        System.out.println(Arrays.toString(pairs));
        }
        private static int binarySearch(int[] arr, int k, int min, int max){

        int m = min + ((max - min) / 2);

            if(max < min){
                return -1;
            }
            if (k == arr[m]) {
                if (m != 0 && arr[m-1] != k) {
                    return m;
                } else {
                    while (m < arr.length && m != 0 && arr[m-1] == k) {
                        m--;
                    }
                    return m;
                }
            } else if (k < arr[m]) {
                if (binarySearch(arr, k, min, m - 1) == -1) {
                    return m;
                }
                else return binarySearch(arr, k, min, m - 1);
            } else if (k > arr[m]) {
                return binarySearch(arr, k, m + 1, max);
            }

            return m;
        }
    }

