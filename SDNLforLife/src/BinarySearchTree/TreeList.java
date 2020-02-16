package BinarySearchTree;

public class TreeList {

    TreeNode root;
    int size;

    public TreeList(TreeNode root) {
        this.root = root;

    }

    public TreeList() {

    }

    public void add(int x) {
        if (root == null) {
            root = new TreeNode(x);
        } else {
            TreeNode bantu = root;
            while (bantu != null) {
                if (x < bantu.element) {
                    if (bantu.left == null) {
                        bantu.left = new TreeNode(x);
                        bantu = null;
                    } else {
                        bantu = bantu.left;
                    }
                } else {
                    if (bantu.right == null) {
                        bantu.right = new TreeNode(x);
                        bantu = null;
                    } else {
                        bantu = bantu.right;
                    }
                }
            }
        }
    }

    public void inOrder(TreeNode localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.left);
            System.out.println(localRoot.element + " ");
            inOrder(localRoot.right);
        }
    }

    public void preOrder(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.println(localRoot.element + " ");
            inOrder(localRoot.left);
            inOrder(localRoot.right);
        }
    }

    public void postOrder(TreeNode localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.left);
            inOrder(localRoot.right);
            System.out.println(localRoot.element + " ");
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    public void preOrder() {
        preOrder(root);
    }

    public void postOrder() {
        postOrder(root);
    }
    TreeNode getNode(int x){
        TreeNode bantu = root;
        while(bantu != null){
            if (bantu.element == x) {
                return bantu;
            }else{
                if (x < bantu.element) {
                    bantu = bantu.left;
                }else{
                    bantu = bantu.right;
                }
            }
        }
        return bantu;
    }
}
