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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        List<Integer> lst = new LinkedList<>();
        while(!s.isEmpty() || root != null){
            while(root != null){
                s.push(root);
                lst.addFirst(root.val); 
                root = root.right;
            }
            root = s.pop();
            root = root.left;
        }
        return lst;
    }
}
