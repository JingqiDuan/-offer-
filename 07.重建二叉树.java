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
    Map<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        TreeNode result = helper(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
        return result;
    }
    private TreeNode helper(int[] preorder, int[] inorder, int preLeft, int preRight,
                    int inLeft, int inRight){
        if(preLeft > preRight || inLeft > inRight){
            return null;
        }
        int rootValue = preorder[preLeft];
        TreeNode root = new TreeNode(rootValue);
        int rIndex = map.get(rootValue);
        root.left = helper(preorder, inorder, preLeft + 1, preLeft + rIndex - inLeft, inLeft, rIndex - 1);
        root.right = helper(preorder, inorder, preLeft + rIndex - inLeft + 1, preRight, rIndex + 1, inRight);
        return root;
    }
}
