// https://leetcode.com/problems/count-items-matching-a-rule/

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int lookupIndex = 0;
        if(ruleKey.equals("color")) {
           lookupIndex = 1;
        } else if(ruleKey.equals("name")) {
            lookupIndex = 2;
        }
        for(List<String> group: items) {
            if(group.get(lookupIndex).equals(ruleValue))
                count++;
        }
        return count;
    }
}