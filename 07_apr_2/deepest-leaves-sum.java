// https://leetcode.com/problems/deepest-leaves-sum/
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
    private int maxDepth = 0;

    public int deepestLeavesSum(TreeNode root) {
        sum(root, 0); // once for maxDepth
        return sum(root, 0); // second for sum
    }

    private int sum(TreeNode root, int depth) {
        if (root == null) {
            return 0;
        }

        if (depth > maxDepth) {
            maxDepth = depth;
        }

        if (root.left == null && root.right == null && depth == maxDepth) {
            return root.val;
        }

        return sum(root.left, depth + 1) + sum(root.right, depth + 1);
    }
}

