public class LC_1732 {
    public static void main(String[] args) {
        //int[] gain = {-5,1,5,0,-7};
        int[] gain = {99};
        int altitude1 = 0;
        int altitude2;
        int maxAltitude = altitude1;
        for (int i = 0; i < gain.length; i++){
            altitude2 = altitude1 + gain[i];
            maxAltitude = Math.max(maxAltitude, altitude2);
            altitude1 = altitude2;
        }
        System.out.println(maxAltitude);
    }
}
