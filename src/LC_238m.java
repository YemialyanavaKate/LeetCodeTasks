import java.util.Arrays;

public class LC_238m {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        //int[] answer;
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        int[] suffix = new int[nums.length];
        suffix[nums.length-1] = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            prefix[i + 1] = nums[i] * prefix[i];
            suffix[nums.length - 2 - i] = nums[nums.length - 1 - i] * suffix[nums.length - 1 - i];
        }
        for (int i = 0; i < nums.length; i++){
            nums[i] = prefix[i] * suffix[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
