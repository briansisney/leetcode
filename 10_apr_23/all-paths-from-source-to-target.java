
// https://leetcode.com/problems/all-paths-from-source-to-target/

class Solution {
    private int[][] graph;
    private List<List<Integer>> masterList;
    private int goal;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.goal = graph.length - 1;
        this.graph = graph;
        masterList = new ArrayList();

        follow(new ArrayList(), 0);

        return masterList;
    }

    private void follow(List<Integer> baselist, int column) {
        baselist.add(column);
        boolean valid = column == goal;

        if (valid) {
            masterList.add(baselist);
            return;
        }

        for (Integer i: graph[column]) {
            follow(new ArrayList<>(baselist), i);
        }
    }

}