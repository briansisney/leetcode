// https://leetcode.com/problems/create-target-array-in-the-given-order/

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i<nums.length;i++) {
            arr.add(index[i], nums[i]);
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();

    }
}