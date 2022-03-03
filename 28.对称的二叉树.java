/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        
        return recur(root.left, root.right);
    }

    private boolean recur(TreeNode left, TreeNode right){
        //this function compare values of two nodes
        if(left == null && right == null){
            return true;
        }
        
        if(left == null || right == null || left.val != right.val){
            return false;
        }
        return recur(left.left, right.right) && recur(right.left, left.right);
    }
}
