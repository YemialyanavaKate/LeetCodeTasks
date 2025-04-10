import java.util.LinkedList;
import java.util.List;

public class LC_876 {
    public static void main(String[] args) {
        List <Integer> head = new LinkedList<>();
        for (int i = 1; i <= 11; i++) {
            head.add(i);
        }
        if ( head.size() == 1) {
            System.out.println(head);
        } else
            System.out.println(head.subList(head.size() / 2, head.size()));
    }
}
