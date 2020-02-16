package BinarySearchTree;

import java.util.Scanner;

public class MainBST {

    public static void main(String[] args) {
        TreeList tree = new TreeList();
        tree.add(47);
        tree.add(25);
        tree.add(77);
        tree.add(11);
        tree.add(43);
        tree.add(65);
        tree.add(93);
        tree.add(7);
        tree.add(17);
        tree.add(31);
        tree.add(44);
        tree.add(48);

        System.out.println("InOrder     :");
        tree.inOrder();
        System.out.println(" ");
        System.out.println("PreOrder    : ");
        tree.preOrder();
        System.out.println(" ");
        System.out.println("PostOrder   : ");
        tree.postOrder();
        System.out.println(" ");
        int x = 17;
        System.out.println("Find a Values : " + x);
        TreeNode cari = tree.getNode(x);
        if (cari == null) {
            System.out.println("Data Not Found");
        } else {
            System.out.print("Data Found :  " + cari.getElement());
        }

    }
}
