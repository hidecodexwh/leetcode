package DayFour;

public class IOTLL02p07 {
    public static void main(String[] args) {
        IOTLL02p07 iotll02p07 = new IOTLL02p07();
        

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;
        while (A != B) {
            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;
        }
        return A;
    }
}
