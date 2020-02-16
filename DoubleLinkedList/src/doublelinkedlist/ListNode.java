
package doublelinkedlist;

public class ListNode {
    int elemen;
    ListNode next;
    ListNode prev;

    public ListNode() {
    }

    ListNode(int elemen) {
        this.elemen = elemen;
        next=null;
        prev=null;
    }

    public ListNode(int elemen, ListNode next, ListNode prev) {
        this.elemen = elemen;
        this.next = next;
        this.prev = prev;
    }

    public int getElemen() {
        return elemen;
    }

    public void setElemen(int elemen) {
        this.elemen = elemen;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}
