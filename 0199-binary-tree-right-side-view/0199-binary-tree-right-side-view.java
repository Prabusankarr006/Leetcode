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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>result=new ArrayList<>();
         if(root ==null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
       
        while(!q.isEmpty()){
            List<Integer>list=new ArrayList<>();
            int size=q.size();
            TreeNode temp=null;
            for(int i=0;i<size;i++){
                temp=q.poll();
                if(i==size-1){
                    result.add(temp.val);
                }
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
        }
        return result;
    }
}
    
