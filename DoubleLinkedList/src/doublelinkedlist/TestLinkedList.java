
package doublelinkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
         LinkedList data = new LinkedList();
        int cari = 4;  //bisa diubah //UNTUK MENCARI DATA

        data.addFirst(10);
        data.addFirst(3);
        data.addFirst(4);
        data.addFirst(7);
        data.addLast(8);
        
//        data.removeFirst2();
//        data.removeLast2();
        
        System.out.println("Hasil: " + data.toString());

        data.search(cari);
        if (data.search(cari) == cari) {
            System.out.println("Data " + cari + " Ditemukan");
        } else {
            System.out.println("Data Tidak Ada");
        }

    }

        
}
