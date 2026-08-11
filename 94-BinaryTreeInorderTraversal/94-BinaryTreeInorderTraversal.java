// Last updated: 8/11/2026, 10:11:04 PM
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
    static List<Integer>res;
    static void dfs(TreeNode root){
        if(root==null){
            return ;
        }
        dfs(root.left);
        res.add(root.val);
        dfs(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        res=new ArrayList<>();
        dfs(root);
        return res;
    }
}