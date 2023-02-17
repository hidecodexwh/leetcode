package DayThree;

import java.util.List;

public class ReverseLinkedList206 {
    public static void main(String[] args) {
        ReverseLinkedList206 reverseLinkedList206 = new ReverseLinkedList206();

    }

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }

        if(head.next == null){
            return head;
        }

        ListNode preNode = head;
        ListNode node = head.next;


        while(node != null){
            ListNode postNode = node.next;
            node.next = preNode;
            preNode = node;
            node = postNode;
        }

        head.next = null;

        return preNode;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }
}
