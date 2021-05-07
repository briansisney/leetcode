// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) {
            return false;
        }
        boolean[] alpha = new boolean[26];

        for(int i = 0; i<sentence.length();i++) {
            alpha[sentence.charAt(i)-97] = true;
        }

        for(int i = 0; i<alpha.length;i++) {
            if (!alpha[i]) {
                return false;
            }
        }

        return true;
    }
}
