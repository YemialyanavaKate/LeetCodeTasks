public class LC_162 {
    public static void main(String[] args) {
        int[] nums = {1};
        if (nums.length == 1){
            System.out.println(0);
        }
        if (nums[0] > nums[1]){
            System.out.println(0);
        }
        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            System.out.println(nums.length - 1);
        }
        for (int i = 1; i < nums.length - 1; i++){
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]){
                System.out.println(i);
            } else if (nums[i] > nums[i + 1]) {
                i = i + 2;
            }

        }
    }
}
