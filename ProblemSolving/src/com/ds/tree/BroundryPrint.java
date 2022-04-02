package com.ds.tree;

import java.util.ArrayList;
import java.util.List;


public class BroundryPrint {

	
	public static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
	
	
	void leftSubTree(Node root,List<Integer> res){
		
		Node temp = root.left;
		while(temp != null) {
			
			if(!isLeafNode(temp))
				res.add(temp.data);
			if(temp.left != null)
				temp = temp.left;
			else if(temp.right != null)
				temp =  temp.right;
		}

	}




	void rightSubTree(Node root,List<Integer> res){
		ArrayList<Integer> tnp = new ArrayList<>();
		Node temp = root.right;
		while(temp != null) {
			
			if(!isLeafNode(temp))
				tnp.add(temp.data);
			if(temp.right != null)
				temp = temp.right;
			else if(temp.left != null)
				temp =  temp.left;
		}
		
		for(int i = tnp.size()-1;i>=0;i++)
			res.add(tnp.get(i));

	}




	void addLeave(Node root,List<Integer> res){
		
		if(isLeafNode(root)) res.add(root.data);
		
		if(root.left != null) addLeave(root.left,res);
		if(root.right != null) addLeave(root.right,res);
		
	}


	boolean isLeafNode(Node root) {
		if(root.left == null && root.right == null)
			return true;
		
		return false;
	}
}


