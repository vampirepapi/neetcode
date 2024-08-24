package tufplus.beginnersproblem.basiclinkedlist;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
        this.val=0;
        next=null;
    }
    
    ListNode(int val) {
        this.val=val;
        next=null;
    }

    ListNode(int val, ListNode next) {
        this.val=val;
        this.next=next;
    }

}
