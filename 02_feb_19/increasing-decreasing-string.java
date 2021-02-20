// https://leetcode.com/problems/increasing-decreasing-string


class Solution {
        public String sortString(String s) {
        TreeMap<String, Integer> map = new TreeMap();
        int current_num;
        String result = "";
        int stringCount = 0;
        String charString = "";
        boolean reverse = false;
        String new_phrase;

        for (int i = 0; i < s.length(); i++) {
            charString = String.valueOf(s.charAt(i));
            if (map.containsKey(charString)) {
                current_num = (int) map.get(charString);
            } else {
                current_num = 0;
            }
            stringCount++;
            map.put(charString, current_num+1);
        }

        while(stringCount > 0){

            new_phrase = "";

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() != 0) {
                    if (reverse) {
                        new_phrase = entry.getKey() + new_phrase;
                    } else {
                        new_phrase += entry.getKey();
                    }

                    stringCount--;
                    entry.setValue(entry.getValue() - 1);
                }
            }

            result += new_phrase;
            reverse = !reverse;
        }

        return result;
    }
}
