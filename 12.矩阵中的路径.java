class Solution {
    public boolean exist(char[][] board, String word) {
        char[] wordChar = word.toCharArray();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(doDfs(board, wordChar, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean doDfs(char[][] board, char[] wordChar, int x, int y, int index){
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] != wordChar[index]){
            return false;
        }
        if(index == wordChar.length - 1){
            return true;
        }
        int[][] adjustment = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        board[x][y] = '\0';
        boolean result = false;
        for(int i = 0; i < 4; i++){
            result =  doDfs(board, wordChar, x + adjustment[i][0], y + adjustment[i][1], index + 1);
            if(result == true){
                return true;
            }
        }
        board[x][y] = wordChar[index];
        return result;
    }
}
