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
    public TreeNode increasingBST(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        TreeNode linkedList = new TreeNode();
        TreeNode ans = linkedList;
        TreeNode temp = root;
        while(!s.isEmpty() || temp != null){
            while(temp != null){
                s.push(temp);
                temp = temp.left;
            }
            temp = s.pop();
            TreeNode temptemp = new TreeNode(temp.val);
            linkedList.right = temptemp;
            linkedList = linkedList.right;
            temp = temp.right;
        }
        return ans.right;
    }
}
