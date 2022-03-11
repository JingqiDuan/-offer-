/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {
    Node head, prev;
    public Node treeToDoublyList(Node root) {
        if(root==null) return null;
        dfs(root);
        prev.right = head;
        head.left =prev;
        return head;
    }

    public void dfs(Node cur){
        if(cur==null){
            return;
        }
        dfs(cur.left);
        if(prev == null){
            head = cur;
        }else{
            prev.right = cur;
        }
        cur.left = prev;
        prev = cur;
        dfs(cur.right);
    }
}
