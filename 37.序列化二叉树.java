/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            return "[]";
        }
        StringBuilder treeStr = new StringBuilder("[");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node != null){//queue[null, null, 4, 5] not null; queue[null,null] null
                treeStr.append(node.val + ",");
                queue.offer(node.left);
                queue.offer(node.right);
            }else{
                treeStr.append("null,");
            }
        }
        treeStr.deleteCharAt(treeStr.length() - 1);
        treeStr.append("]");
        return treeStr.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("[]")){
            return null;
        }
        data = data.substring(1, data.length() - 1);
        String[] values = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while(!queue.isEmpty()){
            TreeNode head = queue.poll();
            if(!"null".equals(values[i])){
                head.left = new TreeNode(Integer.parseInt(values[i]));
                queue.offer(head.left);
            }
            i++;
            if(!values[i].equals("null")){
                head.right = new TreeNode(Integer.parseInt(values[i]));
                queue.offer(head.right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
