public class LC_746 {
    public static void main(String[] args) {
        int[] cost = {2,1};
        int length = cost.length;
        int[] min = new int[length];
        min[length-1] = cost[length-1];
        min[length-2] = cost[length-2];
        int i = length - 3;
        while (i >= 0) {
            if (min[i + 1] >= min[i + 2]) {
                min[i] = cost[i] + min[i + 2];
                i--;
            } else {
                min[i] = cost[i] + min[i + 1];
                i--;
            }
        }
        if (min[0] < min[1]) {
            System.out.println(min[0]);
        } else {
            System.out.println(min[1]);
        }
    }
}
