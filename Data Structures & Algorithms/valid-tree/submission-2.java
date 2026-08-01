class Solution {

    private boolean hasCycle = false;
    public boolean validTree(int n, int[][] edges) {
        HashSet visited = new HashSet<Integer>();
        HashMap<Integer, List<Integer>> adjList = new HashMap<Integer, List<Integer>>();

        for(int i=0; i<n; i++) {
            adjList.put(i, new ArrayList<Integer>());
        }

        for(int[] edge: edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        if(!dfs(adjList, 0, -1, visited)) {
            return false;
        }
        return visited.size() == n;
    }

    private boolean dfs(HashMap<Integer, List<Integer>> adjList, int curNode, int parent, HashSet<Integer> visited) {
        if(!visited.add(curNode)) {
            return false;
        }
        visited.add(curNode);

        for(int neighbor: adjList.get(curNode)) {
            if (neighbor == parent) {
                continue;
            }
            if(!dfs(adjList, neighbor, curNode, visited)) {
                return false;
            }
        }

        return true;
    }
}
