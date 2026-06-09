public class BSTTree {
    static class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
            left = right = null;
        }
    }
    public Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.val) {
            root.left = insert(root.left, key);
        } else if (key > root.val) {
            root.right = insert(root.right, key);
        }
        return root;
    }
    public void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }public static void main(String[] args) {
        BSTTree bst = new BSTTree();
        Node root = null;
        int[] values = {34, 75, 59, 15, 89, 46, 2, 63, 28, 96, 52, 80, 10, 73};
        for (int val : values) {
            root = bst.insert(root, val);
        }
        System.out.println("Preorder Traversal:");
        bst.preorder(root);
        System.out.println("\nInorder Traversal:");
        bst.inorder(root);
        System.out.println("\nPostorder Traversal:");
        bst.postorder(root);
    }
}