package com.ds.tree;

import java.util.*;

import com.ds.tree.Inorder.TreeNode;

public class PostOrder {
	
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
	
	
	public List<Integer> postorderTraversal(TreeNode root) {
        
	       List<Integer> res  = new ArrayList<>();
	        if(root == null) return res;
	        Stack<TreeNode> st= new Stack<TreeNode>();
	        
	        TreeNode cur = root,tmp ;
	        
	        while(cur != null || !st.isEmpty()){
	            if(cur != null){
	                st.push(cur);
	                cur = cur.left;
	            } else {
	                tmp = st.peek().right;
	                if(tmp == null){
	                   tmp =  st.pop();
	                    res.add(tmp.val);
	                    while(!st.isEmpty() && tmp == st.peek().right){
	                            tmp =  st.pop();
	                        
	                            res.add(tmp.val);
	                    }
	                } else {
	                    cur = tmp;
	                }
	            }
	        
	        }
	        
	        return res;
	        
	    }

}
