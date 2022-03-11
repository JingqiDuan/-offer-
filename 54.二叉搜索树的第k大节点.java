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
    public int kthLargest(TreeNode root, int k) {
        ArrayList<Integer> inOrderList = new ArrayList<>();
        helper(root, inOrderList);
        return inOrderList.get(inOrderList.size() - k);
    }
    private void helper(TreeNode root, ArrayList<Integer> inOrderList){
        if(root == null){
            return;
        }
        helper(root.left, inOrderList);
        inOrderList.add(root.val);
        helper(root.right, inOrderList);
    }
}
