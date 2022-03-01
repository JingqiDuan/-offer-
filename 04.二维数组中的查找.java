class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int row = matrix.length, col = matrix[0].length;
        int i = row - 1;
        int j = 0;
      //from bottom of left to the top of right
        while(i >= 0 && j < col){
            if(matrix[i][j] > target){
                i--;
            }else if(matrix[i][j] == target){
                return true;
            }else{
                j++;
            }
        }
        return false;
    }
}
