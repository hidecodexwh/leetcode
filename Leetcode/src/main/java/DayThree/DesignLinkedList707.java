package DayThree;

import sun.awt.image.ImageWatched;

public class DesignLinkedList707 {
    public static void main(String[] args) {

        DesignLinkedList707 myLinkedList = new DesignLinkedList707();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
        myLinkedList.get(1);              // return 2
        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
        myLinkedList.get(1);              // return 3

    }

    class LinkedNode{
        int val;
        LinkedNode next;

        public LinkedNode(int val, LinkedNode next) {
            this.val = val;
            this.next = next;
        }

        public LinkedNode() {
        }
    }

    LinkedNode head;

    public DesignLinkedList707() {
        head = new LinkedNode(0, null);
    }

    public int get(int index) {

        if(index < 0) {
            return -1;
        }

        LinkedNode iterNode = head.next;

        for(int i = 0; i < index; i++){
            if(iterNode == null){
                break;
            }
            iterNode = iterNode.next;
        }

        if(iterNode != null){
            return iterNode.val;
        }else{
            return -1;
        }

    }

    public void addAtHead(int val) {
        LinkedNode iter = head;
        LinkedNode newFisrtNode = new LinkedNode(val, iter.next);
        head.next = newFisrtNode;
    }

    public void addAtTail(int val) {
        LinkedNode iter = head;
        LinkedNode newTailNode = new LinkedNode(val, null);

        while(iter != null){
            if(iter.next == null){
                iter.next = newTailNode;
                break;
            }else{
                iter = iter.next;
            }
        }
    }

    public void addAtIndex(int index, int val) {
        if(index < 0) {
            return;
        }

        LinkedNode iter = head;

        for(int i = 0; i < index; i++){
            if(iter != null){
                iter = iter.next;
            }else{
                break;
            }
        }

        if(iter == null){
            return;
        }

        LinkedNode newNode = new LinkedNode(val, iter.next);
        iter.next = newNode;


    }

    public void deleteAtIndex(int index) {
        if(index < 0 || head.next == null){
            return;
        }

        LinkedNode iter = head.next;
        LinkedNode preIter = head;

        for(int i = 0; i < index; i++){
            if(iter == null){
                break;
            }else{
                preIter = iter;
                iter = iter.next;
            }
        }

        if(iter == null){
            return;
        }else{
            preIter.next = iter.next;
        }
    }
}
