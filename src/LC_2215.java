import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC_2215 {
    public static void main(String[] args) {
        //int[] nums1 = {1,2,3};
        //int[] nums2 = {2,4,6};

        //int[] nums1 = {1,2,3,3};
        //int[] nums2 = {1,1,2,2};

        int[] nums1 = {1,-2};
        int[] nums2 = {0,-2};


        List<Integer> answer1 = searchDistinctElement(nums1, nums2);
        List<Integer> answer2 = searchDistinctElement(nums2, nums1);
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(answer1);
        answer.add(answer2);
        System.out.println(answer);
    }
    public static List<Integer> searchDistinctElement(int[] nums1, int[] nums2){
        Set<Integer> nums = new HashSet<>();
        int j;
        for (Integer num : nums1){
            j = 0;

            while (j <nums2.length && !(num == nums2[j])){
                j++;
            }
            if ((j == (nums2.length)) && !(num == nums2[j - 1])){
                nums.add(num);
            }

        }
        return new ArrayList<>(nums);
    }
}
