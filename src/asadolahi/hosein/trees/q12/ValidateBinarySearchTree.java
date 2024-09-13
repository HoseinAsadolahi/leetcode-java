package asadolahi.hosein.trees.q12;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isValidBST2(TreeNode root, int min, int max) {
        if (root == null) return true;
        if (min > root.val || max < root.val) return false;
        return isValidBST2(root.left, min, root.val) && isValidBST2(root.right, root.val, max);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
