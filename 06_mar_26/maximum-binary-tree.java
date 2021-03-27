// https://leetcode.com/problems/maximum-binary-tree/

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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        return buildTree(nums, 0, nums.length);
    }

    private TreeNode buildTree(int[] nums, int leftIndex, int rightIndex) {
        if (leftIndex == rightIndex) {
            return null;
        }

        int maxIndex = leftIndex;

        for (int i = leftIndex; i < rightIndex; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        TreeNode root = new TreeNode(nums[maxIndex]);

        root.left = buildTree(nums, leftIndex, maxIndex);
        root.right = buildTree(nums, maxIndex + 1, rightIndex);

        return root;
    }
}
