import java.util.Arrays;

public class LC_334new {
    public static void main(String[] args) {
        int[] nums = {0,4,2,1,0,-1,-3};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums){
        boolean answer = false;
        int min = nums[0];
        int[] arrMax =Arrays.copyOfRange(nums, 2,nums.length);
        int max = max(arrMax);
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > min) {
                if (nums[i] == max) {
                    answer = false;
                    arrMax =Arrays.copyOfRange(nums, i + 1,nums.length);
                    max = max(arrMax);
                }
                if (max > nums[i]) {
                    answer = true;
                }
            }
        }
        return answer;
    }
    public static int max(int[] nums){
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
