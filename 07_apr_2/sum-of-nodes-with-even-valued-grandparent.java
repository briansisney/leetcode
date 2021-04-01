// https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/submissions/

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
    private int total;
    public int sumEvenGrandparent(TreeNode root) {
        sum(root, false, false);
        return total;
    }

    private void sum(TreeNode root, boolean parent, boolean grandparent) {
        if (root == null) {
            return;
        }

        if (grandparent) {
            total += root.val;
        }

        sum(root.left, isEven(root.val), parent);
        sum(root.right, isEven(root.val), parent);
    }

    private boolean isEven(int val) {
        return val % 2 == 0;
    }
}
