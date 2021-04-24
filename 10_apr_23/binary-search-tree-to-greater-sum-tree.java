// https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/

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
    private Stack<TreeNode> stack;

    public TreeNode bstToGst(TreeNode root) {
        stack = new Stack();
        int sum = 0;
        createStack(root);

        TreeNode node;

        while (!stack.empty()) {
            node = stack.pop();
            sum += node.val;
            node.val = sum;
        }

        return root;
    }


    public void createStack(TreeNode root) {
        if (root.left != null) {
            createStack(root.left);
        }
        stack.add(root);
        if (root.right != null) {
            createStack(root.right);
        }
    }
}