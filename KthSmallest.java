/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    ArrayList<Integer>al;
    public int kthsmallest(TreeNode A, int B) {
      al=new ArrayList<>();
      inorder(A,B);
      return al.get(B-1);
        
    }
    public void inorder(TreeNode A,int B)
    {
        if(A==null)
        {
            return;
        }
        inorder(A.left,B);
        al.add(A.val);
        if(al.size()==B){
            return;
        }
        inorder(A.right,B);
    }
    }
