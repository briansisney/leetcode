// https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/submissions/

class Solution {
    public int minPartitions(String n) {
        int i = 0;
        int curr;
        int max = 0;
        while (i < n.length()) {
            curr = Character.getNumericValue(n.charAt(i));
            if (curr > max)
                max = curr;
            if (max == 9)
                return 9;
            i++;
        }
        return max;
    }
}
