// https://leetcode.com/problems/maximum-ice-cream-bars/

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        while (coins > 0 && count < costs.length) {
            if (costs[count] > coins) {
                break;
            }
            coins -= costs[count];
            count++;
        }

        return count;
    }
}
