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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if(root == null){
            return results;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean inOrder = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode head = queue.poll();
                if(inOrder){
                    level.add(head.val);
                }else{
                    level.add(0, head.val);
                }
                
                if(head.left != null){
                    queue.offer(head.left);
                }
                if(head.right != null){
                    queue.offer(head.right);
                }
            }
            results.add(level);
            inOrder = !inOrder;
        }
        return results;
    }
}
