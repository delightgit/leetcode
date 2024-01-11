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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> qq = new LinkedList<>();
        Queue<TreeNode> pq = new LinkedList<>();
        qq.add(q);
        pq.add(p);
        while(!qq.isEmpty() && !pq.isEmpty()){
            TreeNode qcurr = qq.poll();
            TreeNode pcurr = pq.poll();
            
            if(qcurr == null && pcurr == null){
                continue;
            }
            if(qcurr == null || pcurr == null){
                return false;
            }
            if(qcurr.val != pcurr.val){
                return false;
            }

            qq.add(qcurr.left);
            pq.add(pcurr.left);
            qq.add(qcurr.right);
            pq.add(pcurr.right);
        }
        return qq.isEmpty() && pq.isEmpty();
    }
}
