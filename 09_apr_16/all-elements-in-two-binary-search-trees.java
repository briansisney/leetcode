// https://leetcode.com/problems/all-elements-in-two-binary-search-trees/

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
    private ArrayList<Integer> list = new ArrayList();

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList();
        l1 = getList(root1, l1);

        List<Integer> l2 = new ArrayList();
        l2 = getList(root2, l2);

        compare(l1, l2, 0, 0);

        return list;
    }

    private List<Integer> getList(TreeNode root, List<Integer> l1) {
        if (root == null)
            return l1;

        l1 = getList(root.left, l1);
        l1.add(root.val);
        return getList(root.right, l1);
    }


    private void compare(List<Integer> l1, List<Integer> l2, int i1, int i2) {
        if (i1 == l1.size() && i2 == l2.size())
            return;

        while (i1 == l1.size() && i2 < l2.size()) {
            list.add(l2.get(i2));
            i2++;
        }

        while (i2 == l2.size() && i1 < l1.size()) {
            list.add(l1.get(i1));
            i1++;
        }

        while (i1 < l1.size() && l1.get(i1) < l2.get(i2)) {
            list.add(l1.get(i1));
            i1++;
        }

        while (i2 < l2.size() && i1 < l1.size() && l2.get(i2) <= l1.get(i1)) {
            list.add(l2.get(i2));
            i2++;
        }

        compare(l1, l2, i1, i2);
    }

}