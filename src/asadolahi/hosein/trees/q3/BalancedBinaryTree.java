package asadolahi.hosein.trees.q3;

import asadolahi.hosein.trees.q2.MaximumDepthOfBinaryTree;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return maxDepth(root) != -1;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        if (left == -1) {
            return left;
        }
        int right = maxDepth(root.right);
        if (right == -1) {
            return right;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
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

        TreeNode(int val, MaximumDepthOfBinaryTree.TreeNode left, MaximumDepthOfBinaryTree.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
