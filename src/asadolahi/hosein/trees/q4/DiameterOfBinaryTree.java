package asadolahi.hosein.trees.q4;

import asadolahi.hosein.trees.q3.BalancedBinaryTree;

public class DiameterOfBinaryTree {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        calcDiameter(root);
        return max;
    }

    public int calcDiameter(TreeNode root) {
        if (root == null) return 0;
        int left = calcDiameter(root.left);
        int right = calcDiameter(root.right);
        max = Math.max(max, left + right);
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

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
