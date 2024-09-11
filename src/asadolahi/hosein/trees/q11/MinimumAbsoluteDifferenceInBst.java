package asadolahi.hosein.trees.q11;

public class MinimumAbsoluteDifferenceInBst {
    int min = Integer.MAX_VALUE;
    int temp;
    boolean hit;

    public int getMinimumDifference(TreeNode root) {
        temp = root.val;
        dfs(root);
        return min;
    }

    public void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        if (hit && min > root.val - temp) {
            min = root.val - temp;
        }
        hit = true;
        temp = root.val;
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
