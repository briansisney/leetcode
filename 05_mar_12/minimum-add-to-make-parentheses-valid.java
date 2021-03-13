# https://leetcode.com/problems/minimum-add-to-make-parentheses-valid

class Solution {
    public int minAddToMakeValid(String s) {
        int left = 0; // open
        int right = 0; //close
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                left++ ;
            } else {
                if (left > 0) {
                    left--;
                } else {
                   right++;
                }
            }

            i++;
        }


        return left + right;
    }
}
