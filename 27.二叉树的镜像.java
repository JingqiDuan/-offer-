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
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return null;
        }
        //store left node
        TreeNode tmp = root.left;
        //assign right node to the left
        root.left =  mirrorTree(root.right);
        //assign stored left to the right;
        root.right = mirrorTree(tmp);
        return root;
    }
}
