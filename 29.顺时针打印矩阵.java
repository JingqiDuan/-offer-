class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int index = 0;
        int[] result = new int[matrix.length * matrix[0].length];
        //mind the border
        while(true){
            //left to right
            for(int i = left; i <= right; i++){
                result[index++] = matrix[top][i];
            }
            if(++top > bottom) break;
            //top to bottom
            for(int i = top; i <= bottom; i++){
                result[index++] = matrix[i][right];
            }
            if(--right < left) break;
            
            //right to left
            for(int i = right; i >= left; i--){
                result[index++] = matrix[bottom][i];
            }
            if(--bottom < top) break;
            //bottom to top
            for(int i = bottom; i >= top; i--){
                result[index++] = matrix[i][left];
            }
            if(++left > right) break;
        }
        return result;
    }
}
