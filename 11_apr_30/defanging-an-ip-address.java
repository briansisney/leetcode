// https://leetcode.com/problems/defanging-an-ip-address

class Solution {
    public String defangIPaddr(String address) {
        String result = "";
        for (char ch: address.toCharArray()) {
            if (ch == '.') {
                result += "[.]";
            } else {
                result += ch;
            }
        }
        return result;
    }
}
