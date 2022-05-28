class Solution {
    public int movingCount(int m, int n, int k) {
        if(k == 0){
            return 1;
        }
        int result = 0;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        queue.offer(new int[]{0, 0});
        result++;
        visited[0][0] = true;
        int[][] adj = new int[][]{{1, 0}, {0, 1}};
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int[] cor = queue.poll();
                for(int j = 0; j < 2; j++){
                    int x = cor[0] + adj[j][0];
                    int y = cor[1] + adj[j][1];
                    if(x < m && y < n && !visited[x][y] && inBound(x, y, k)){
                        queue.offer(new int[]{x, y});
                        result++;
                        visited[x][y] = true;
                    }
                }
            }
        }
        return result;
    }
    
    public boolean inBound(int x, int y, int k){
        int count = 0;
        while(x != 0 || y != 0){
            count += x % 10;
            count += y % 10;
            x /= 10;
            y /= 10;
        }
        return count <= k;
    }
}
