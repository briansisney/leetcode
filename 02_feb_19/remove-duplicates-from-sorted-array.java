// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(i == 0) {
                count++;
                continue;
            }

            if(nums[i] == nums[i-1]) {
                continue;
            } else {
                nums[count] = nums[i];
                count++;
            }

        }
        return count;
    }
}

