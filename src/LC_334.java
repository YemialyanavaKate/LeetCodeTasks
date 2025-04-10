import java.util.Arrays;

public class LC_334 {
    public static void main(String[] args) {
        int[] nums = {0,4,2,1,0,-1,-3};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums){
        boolean answer = false;
        int min = nums[0];
        int[] arrMax =Arrays.copyOfRange(nums, 2,nums.length);
        int max = Arrays.stream(arrMax).max().getAsInt();
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > min) {
                if (nums[i] == max) {
                    answer = false;
                    arrMax =Arrays.copyOfRange(nums, i,nums.length);
                    max = Arrays.stream(arrMax).max().getAsInt();
                }
                if (max > nums[i]) {
                    answer = true;
                }
            }
        }
        return answer;
    }
}
