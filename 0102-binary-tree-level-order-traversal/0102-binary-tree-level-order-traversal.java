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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>result=new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        if(root ==null){
            return result;
        }
        while(!q.isEmpty()){
            List<Integer>list=new ArrayList<>();
            int size=q.size();
            TreeNode temp=null;
            for(int i=0;i<size;i++){
                temp=q.poll();
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
                list.add(temp.val);
            }
            result.add(list);
        }
        return result;
    }
}