/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> results = new ArrayList<>();
        if(root == null){
            return results;
        }
        Stack<Integer> path = new Stack<>();
        helper(root, target, path, results);
        return results;
    }
    private void helper(TreeNode root, int target, Stack<Integer> path, List<List<Integer>> results){
        if(root == null){
            return;
        }
        //have to put root here, because new target can't be passed from the parameter of each func
        target -= root.val;
        path.push(root.val);
        if(target == 0 && root.left == null && root.right == null){//to the leaf
            results.add(new ArrayList(path));
        }
        helper(root.left, target, path, results);
        helper(root.right, target, path, results);
        path.pop();
    }
}
