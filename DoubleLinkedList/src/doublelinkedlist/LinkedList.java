/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

/**
 *
 * @author admin
 */
public class LinkedList {
     private ListNode head;
    private int size;

    public LinkedList() {
        head = new ListNode();
        head.next = head;
        head.prev = head;
        size = 0;
    }

    private void addBefore(int elemen, ListNode bantu) {
        ListNode baru = new ListNode(elemen);
        baru.next = bantu;
        baru.prev = bantu.prev;
        bantu.prev.next = baru;
        bantu.prev = baru;
    }

    public void addFirst(int elemen) {
        addBefore(elemen, head.next);
    }

    public void addLast(int elemen) {
        addBefore(elemen, head);
    }

    public ListNode remove(ListNode bantu) {
        if (!isEmpty()) {
            bantu.prev.next = bantu.next;
            bantu.next.prev = bantu.prev;
            bantu.prev = null;
            bantu.next = null;
            size++;
        }
        return bantu;
    }

    public void removeFirst() {
        remove(head.next);
    }

    public void removeFirst2() {
        if (!isEmpty()) {
            head.next = head.next.next;
            head.next.prev = head;
        } else {
            System.out.println("List Kosong");
        }
    }

    public void removeLast() {
        remove(head.prev);
    }

    public void removeLast2() {
        if (!isEmpty()) {
            head.prev = head.prev.prev;
            head.prev.next = head;
        } else {
            System.out.println("List Kosong");
        }
    }

    public int search(int cari) {
        ListNode temp = head.next;

        int x = -1;
        while (temp != head) {
            if (temp.elemen == cari) {
                x = temp.elemen;
            }
            temp = temp.next;
        }
        return x;
    }

    public boolean isEmpty() {
        if (head.next != head) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        ListNode bantu = head.next;
        String elemen = "";
        while (bantu != head) {
            elemen += bantu.elemen + " ";
            bantu = bantu.next;
        }
        System.out.println();
        return elemen;
    }
}
