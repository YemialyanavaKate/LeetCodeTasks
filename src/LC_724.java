public class LC_724 {
    public static void main(String[] args) {
        int[] nums = {-1,-1,1,1,0,0};
        int i;
        int sum = 0;
        int sumL = 0;
        int sumR = 0;

        if (nums.length == 1 && nums[0] == 0){
            System.out.println(0);
        } else if (nums.length == 1){
            System.out.println(-1);
        }
        for (int k = 0; k < nums.length; k++){
            sum += nums[k];
        }
        if (sum - nums[0]  == 0){
            System.out.println(0);
        }
       /* if (sum - nums[nums.length - 1]  == 0){
            System.out.println(nums.length - 1);
        }*/
        for (i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                sumL += nums[j];
            }
            for(int j = i + 1; j < nums.length; j++){
                sumR += nums[j];
            }
            if (sumL == sumR){
                System.out.println(i);
            }
            sumL = 0;
            sumR = 0;
        }
        System.out.println(-1);
    }
}
