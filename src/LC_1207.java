import java.util.HashSet;
import java.util.Set;

public class LC_1207 {
    public static void main(String[] args) {
        int[] arr = {-3};
        int count = 0;
        Set<Integer> setKey = new HashSet<>();
        Set<Integer> setValue = new HashSet<>();


        for (int i : arr) {
            setKey.add(i);
        }
        for (Integer i : setKey) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]){
                    count++;
                }
            }
            setValue.add(count);
        }
        if (setKey.size() == setValue.size()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
