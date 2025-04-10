public class LC_206 {
    public static void main(String[] args) {

        //Работает
        /*List<Integer> head = new LinkedList<>();
        head.add(1);
        head.add(2);
        head.add(3);
        head.add(4);
        head.add(5);

        if (head.size() == 0) {
            System.out.println(head);
        } else {
            int i = head.size() - 1;
            int lastNode = head.get(head.size() - 1);
            while (i >= 0) {
                lastNode = head.get(i);
                head.add(head.size(), lastNode);
                head.remove(i);
                i--;
            }

            System.out.println(head);
        }*/

        //Рекурсия

        /*List<Integer> head = new LinkedList<>();
        head.add(1);
        head.add(2);
        head.add(3);
        head.add(4);
        head.add(5);

        int i = head.size() - 1;
        recursionInversion(head, i);

            System.out.println(head);

    }
    public static List<Integer> recursionInversion (List<Integer> head, int i){
        //int result;
       // i = head.size() - 1;
        if ((i == 0 && head.size() == 1) || head.isEmpty() || i == -1) {
            return head;
        } else {
            int lastNode;
            lastNode = head.get(i);
            head.add(head.size(), lastNode);
            head.remove(i);
            i--;
            recursionInversion(head, i);
            return head;
        }*/

        //Отправила: превышен лимит времени
       /* *
         * Definition for singly-linked list.
         * public class ListNode {
         *     int val;
         *     ListNode next;
         *     ListNode() {}
         *     ListNode(int val) { this.val = val; }
         *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         * }*/
        LC_206_ListNode head = new LC_206_ListNode();
        int count = 1;
        while (head != null && count < 6){

            LC_206_ListNode newNode = new LC_206_ListNode();
            newNode.val = count;
            //LC_206_ListNode current = head.next;
            if (head == null){
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            count++;
           // head.next.val = count;
        }
        int i = count - 1;
        reverseList (head, i);
        System.out.println(head);
    }
    public static LC_206_ListNode reverseList (LC_206_ListNode head, int i) {
        LC_206_ListNode current = head;
        if (head == null) {
            System.out.println(head);
        }
        while (head != null){
            current = head.next;
        }
        LC_206_ListNode new_node = new LC_206_ListNode (current.val);
        current = null;
        return current;
    }
}
