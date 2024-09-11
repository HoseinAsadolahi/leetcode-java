package asadolahi.hosein.trees.q10;

import asadolahi.hosein.trees.q9.BinaryTreeLevelOrderTraversal;

public class KthSmallestElementInABst {
    int ans;
    int kIndex;

    public int kthSmallest(TreeNode root, int k) {
        kIndex = k;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root) {
        if (root == null) return;
        if (kIndex < 0) return;
        dfs(root.left);
        kIndex--;
        if (kIndex == 0) {
            ans = root.val;
        }
        dfs(root.right);
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
