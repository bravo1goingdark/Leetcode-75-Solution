public class provinces {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];

        int provinces = 0;

        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                dfs(isConnected , visited , i);
                provinces++;
            }
        }

        return provinces;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int node) {
        visited[node] = true;

        for (int neigbhour = 0; neigbhour < isConnected.length; neigbhour++) {
            if (isConnected[node][neigbhour] == 1 && !visited[neigbhour]) {
                dfs(isConnected, visited, neigbhour);
            }
        }
    }
}
