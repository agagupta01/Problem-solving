package com.ds.tree;

import java.util.*;

import com.ds.tree.Inorder.TreeNode;

public class PreOrder {

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
	
public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> res  = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> st= new Stack<TreeNode>();
        
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            
            res.add(root.val);
            if(root.right != null){
                st.push(root.right);
            }
            
            if(root.left != null){
                st.push(root.left);
            }
        }
        
        return res;
    }


}
