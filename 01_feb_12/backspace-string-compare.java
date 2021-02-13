// https://leetcode.com/problems/backspace-string-compare/
class Solution {
    public boolean backspaceCompare(String S, String T) {
        StringBuilder sbS = new StringBuilder();
        StringBuilder sbT = new StringBuilder();
        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch !='#') {
                sbS.append(ch);

            } else {
                if(sbS.length() > 0) {
                    sbS.deleteCharAt(sbS.length() - 1);
                }

            }
        }

        for(int i=0; i<T.length(); i++) {
            char ch = T.charAt(i);
            if (ch != '#') {
                sbT.append(ch);
            } else {
                if(sbT.length() > 0) {
                    sbT.deleteCharAt(sbT.length() - 1);
                }
            }
        }

        return sbS.toString().equals(sbT.toString());
    }
}