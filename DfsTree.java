class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}
public class DfsTree {
    public void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(15);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(9);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(4);
        DfsTree dfs = new DfsTree();
        System.out.println("Preorder Traversal:");
        dfs.preorder(root);
        System.out.println("\nInorder Traversal:");
        dfs.inorder(root);
        System.out.println("\nPostorder Traversal:");
        dfs.postorder(root);
    }
}