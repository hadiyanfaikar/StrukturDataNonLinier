
package BinarySearchTree;

public class TreeNode {
    
    TreeNode left;
    TreeNode right;
    int element;
    
    public TreeNode(int elemen){
        this.element = elemen;
    }
    public TreeNode(int elemen , TreeNode left , TreeNode right){
        this.left = left;
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }
    
}
