package DayThree;

public class RLLE203 {
    public static void main(String[] args) {
        RLLE203 rlle203 = new RLLE203();

    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode headPointer = new ListNode(0, head);

        ListNode pointer = headPointer;

        while(pointer != null){
            ListNode nextPointer = pointer.next;

            if(nextPointer == null){
                break;
            }

            if(nextPointer.val == val){
                pointer.next = nextPointer.next;
            }else{
                pointer = pointer.next;
            }
        }

        return headPointer.next;
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
