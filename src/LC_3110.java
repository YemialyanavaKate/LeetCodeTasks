import java.util.Scanner;

public class LC_3110 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        int x = 0;
        int element1 = 0;
        int element2;

        for (int i = 0; i < s.length(); i++){
            if (i == 0){
                element1 = s.charAt(i);
                element2 = s.charAt(i + 1);
                x = x + Math.abs(element1 - element2);

            } else {
                element2 = s.charAt(i);
                x = x + Math.abs(element1 - element2);
            }
            element1 = element2;
        }
        System.out.println(x);
    }

}
