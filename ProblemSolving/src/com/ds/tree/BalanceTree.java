package com.ds.tree;

import com.ds.tree.PreOrder.TreeNode;

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
class BalanceTree {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
    public boolean isBalanced(TreeNode root) {
        
        return findHeight(root) != -1 ? true : false;
    }
    
    public int findHeight(TreeNode root){
        
        if(root == null)
            return 0;
        
        int left = findHeight(root.left);
        if(left == -1)
            return -1;
        
        int right = findHeight(root.right);
        if(right == -1)
            return -1;
        
        if(Math.abs(left - right) > 1) return -1;
        
        return Math.max(left,right) + 1;
    }
}