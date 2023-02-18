package DayFour;

public class RNNFEOL19 {


    public static void main(String[] args) {
        RNNFEOL19 rnnfeol19 = new RNNFEOL19();
        ListNode N5 = new ListNode(5, null);
        //ListNode N4 = new ListNode(4, N5);
        //ListNode N3 = new ListNode(3, N4);
        //ListNode N2 = new ListNode(2, N3);
        //ListNode N1 = new ListNode(1, N2);

        ListNode listNode = rnnfeol19.removeNthFromEnd(N5, 1);



    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode virtualHead = new ListNode(0, head);
        ListNode fastIter = virtualHead;
        ListNode slowIter = virtualHead;
        //int num = n + 1;
        while(n != 0){
            fastIter = fastIter.next;
            n--;
        }

        if(fastIter == null){
            return head;
        }

        while(fastIter.next != null){
            fastIter = fastIter.next;
            slowIter = slowIter.next;
        }

        slowIter.next = slowIter.next.next;



        return virtualHead.next;



    }


}

class ListNode {
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
