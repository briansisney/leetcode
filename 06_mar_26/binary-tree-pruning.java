// https://leetcode.com/problems/binary-tree-pruning/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if (root.left != null && hasKids(root.left)) {
            pruneTree(root.left);
        }

        if (root.right != null && hasKids(root.right)) {
            pruneTree(root.right);
        }

        if (delete(root.left)) {
            root.left = null;
        }

        if (delete(root.right)) {
            root.right = null;
        }

        if (delete(root)) {
            return null;
        }

        return root;
    }

    private boolean delete(TreeNode node) {
        if (node == null) {
            return true;
        }
        return node.val == 0 && node.left == null && node.right == null;
    }

    private boolean hasKids(TreeNode node) {
        return node.left != null || node.right != null;
    }

}
