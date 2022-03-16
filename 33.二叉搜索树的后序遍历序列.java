class Solution {
    public boolean verifyPostorder(int[] postorder) {
        if (postorder.length < 2) return true;
        return helper(postorder, 0, postorder.length - 1); 
    }

    private boolean helper(int[] postorder, int left, int right){
        if(left >= right){
            return true;
        }
        int k = left;
        while(left < right && postorder[k] < postorder[right]){
            k++;
        }
        //find  index of the value bigger than root value
        for(int i = k; i < right; i++){
            if(postorder[i] < postorder[right]){
                return false;
            }
        }
        //check left subtree
        if (!helper(postorder, left, k - 1)) return false; 
        //check right subtree
        if (!helper(postorder, k, right - 1)) return false; 
        return true;
    }
}
