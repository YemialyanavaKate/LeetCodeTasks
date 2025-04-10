import java.util.Arrays;

public class LC_283 {
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        //int [] nums = {0,1,0,0,12};
        //int [] nums = {1,21,0,0,0};
        //int[] nums = {4,2,4,0,0,3,0,5,1,0};
        //int[] nums = {0,0};
        int j;

        if (nums.length == 1) {
            System.out.println(Arrays.toString(nums));
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && !(nums[i + 1] == 0)) {
                nums[i] = nums[i + 1];
                nums[i + 1] = 0;
            } else if (nums[i] == 0 && (nums[i + 1] == 0)){
                j = i + 1;
                while ( j < nums.length - 1 && nums[j] == 0){
                    j++;
                }
                nums[i] = nums[j];
                if (!(j + 2 == nums.length)) {
                    nums[j] = 0;
                } else {
                    nums[j] = nums[i + 1];
                    nums[i + 1] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
