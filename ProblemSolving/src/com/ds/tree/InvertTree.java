package com.ds.tree;

import java.util.*;

import com.ds.tree.PostOrder.TreeNode;

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
class InvertTree {
	
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
	
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp = root;
        
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        qu.offer(temp);
        
        while(qu.isEmpty()){
            int size = qu.size();
            for(int i =0;i < size;i++){
               TreeNode tm =  qu.poll();
                if(tm.left != null && tm.right != null){
                    swap(tm);
                }
                 if(tm.left != null)
                     qu.offer(tm.left);
                
                if(tm.left != null)
                     qu.offer(tm.left);
            }
        }
        
        
        return root;
    }
    
    public void swap(TreeNode temp){
        TreeNode tm = temp.left;
        
        temp.left = temp.right;
        
        temp.right = tm;
    }
}