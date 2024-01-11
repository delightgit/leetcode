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
    public int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode> q = new LinkedList<>();
        int val = root.val;
        q.add(root);
        int sum = 0;
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            int currVal = curr.val;
            if(currVal >= low && currVal <= high){
                sum += currVal;
            }
            if(curr.left != null && currVal > low){
                q.add(curr.left);
            }
            if(curr.right != null && currVal < high){
                q.add(curr.right);
            }
        }
        return sum;
    }
}
