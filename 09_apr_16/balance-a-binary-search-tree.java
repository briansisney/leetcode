// https://leetcode.com/problems/balance-a-binary-search-tree
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
    private List<Integer> list = new ArrayList();

    public TreeNode balanceBST(TreeNode root) {
        makeList(root);

        return createTree(0, list.size()-1);
    }

    private TreeNode createTree(int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = (left + right)/2;

        TreeNode node = new TreeNode(list.get(mid));

        node.left = createTree(left, mid-1);
        node.right = createTree(mid+1, right);

        return node;
    }


    private void makeList(TreeNode root) {
        if (root == null) {
            return;
        }

        makeList(root.left);
        list.add(root.val);
        makeList(root.right);
    }


}
