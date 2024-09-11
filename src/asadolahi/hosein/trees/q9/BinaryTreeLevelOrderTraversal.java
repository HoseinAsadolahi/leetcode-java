package asadolahi.hosein.trees.q9;

import asadolahi.hosein.trees.q8.SubtreeOfAnotherTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        result.add(new ArrayList<>());
        levelOrder2(root, result, 0);
        return result;
    }

    public void levelOrder2(TreeNode root, List<List<Integer>> result, int index) {
        if (root == null) {
            return;
        }
        result.get(index).add(root.val);
        if (root.left == null && root.right == null) {
            return;
        }
        if (result.size() <= index + 1) {
            result.add(new ArrayList<>());
        }
        levelOrder2(root.left, result, index + 1);
        levelOrder2(root.right, result, index + 1);
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
