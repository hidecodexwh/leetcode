package DayFour;

public class SwapNodesInParis24 {
    public static void main(String[] args) {
        SwapNodesInParis24 swapNodesInParis24 = new SwapNodesInParis24();


    }
    
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode virtualHead = new ListNode();
        virtualHead.next = head;

        ListNode iter0 = virtualHead;
        ListNode iter1 = iter0.next;
        ListNode iter2 = iter1.next;
        ListNode iter3 = iter2.next;

        while(iter1 != null && iter2 != null){
            iter0.next = iter2;
            iter2.next = iter1;
            iter1.next = iter3;

            iter0 = iter1;
            iter1 = iter3;
            if(iter1 != null){
                iter2 = iter1.next;
                if(iter2 != null){
                    iter3 = iter2.next;
                }else{
                    iter3 = null;
                }
            }else{
                iter2 = null;
            }
        }

        return virtualHead.next;
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

}
