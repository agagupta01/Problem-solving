package com.ds.tree;





/*
 
Print the right side view of the binary tree.
 
                500
               /       \
              /         \
           /             \
        200                700
        /  \                  \
     100    400                 900
     /  \     \
    50   150   450 
        /      /
      130     420
 
500, 700, 900, 450,420
 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RightSideViewOfBT {

    public static class Node {
        int val;
        Node left;
        Node right;
        
        Node(int data){
            val = data;
            left = right = null;
        }
    }
    
    
    static void print(Node root) {
        
        
        Queue<Node> qu = new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            
            int size = qu.size();
             Node tmp = null;
            for(int i = 0;i < size;i++){
                
                 tmp = qu.poll();

                
                if(tmp.left != null){
                    qu.offer(tmp.left);
                }
                if(tmp.right != null){
                    qu.offer(tmp.right);
                }
            }
            System.out.print(tmp.val + " ");
            
        }
        
    }

 public static void main(String[] args) {
        Node root = new Node(500);
        Node a1 = new Node(200);
        Node a2 = new Node(700);
        root.left = a1;
        root.right = a2;
        Node b1 = new Node(100);
        Node b2 = new Node(400);
        a1.left = b1;
        a1.right = b2;
        Node c1 = new Node(50);
        Node c2 = new Node(150);
        Node c3 = new Node(450);
        b1.left = c1;
        b1.right = c2;
        b2.right = c3;
         Node f1 = new Node(130);
        Node f2 = new Node(420);
        c2.left = f1;
        c3.left = f2;
        
        Node c4 = new Node(480);
        c3.right = c4;
        Node h1 = new Node(900);
         Node h3 = new Node(750);
         h1.left = h3;
         
        a2.right = h1;
        
        print(root);        
   }
}



