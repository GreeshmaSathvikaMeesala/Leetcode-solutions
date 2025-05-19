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
        TreeNode prev=null;
        TreeNode one=null;
        TreeNode two=null;
    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp=one.val;
        one.val=two.val;
        two.val=temp;
    }
    private void inorder(TreeNode node){
        if(node==null){
            return;
        }
        inorder(node.left);
        if(prev!=null && prev.val>node.val){
            if(one==null){
                one=prev;
            }
            two=node;
        }
        prev=node;
        inorder(node.right);
    }
}