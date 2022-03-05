class Solution {
    public int maxValue(int[][] grid) {
        int rowNum = grid.length;
        int colNum = grid[0].length;
        if(grid == null || rowNum == 0 || colNum == 0){
            return 0;
        }
        for(int row = 0; row < rowNum; row++){
            for(int col = 0; col < colNum; col++){
                if(col == 0 && row == 0){
                    continue;
                }
                if(row > 0 && col == 0){
                    grid[row][col] += grid[row - 1][col];
                }else if(row == 0 && col > 0){
                    grid[row][col] += grid[row][col - 1];
                }else{
                    grid[row][col] += Math.max(grid[row - 1][col], grid[row][col - 1]);
                }
            }
        }
        return grid[rowNum - 1][colNum - 1];
    }
}
