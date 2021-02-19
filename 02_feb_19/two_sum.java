// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap numbers = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        int match;

        for(int i=0; i < nums.length; i++) {
            match = target - nums[i];

            if (numbers.containsKey(match)) {
                result[0] = (int) numbers.get(match);
                result[1] = i;
                break;
            } else {
                numbers.put(nums[i], i);
            }

        }
        return result;
    }
}


