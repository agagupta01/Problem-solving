package com.ds.StringTest;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class demo {

	public static void main(String[] args) {

        Stack stack = new Stack<Integer>();
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        for(int i =1 ; i <= num ; i ++){
            String s = in.nextLine();
            String str[] = s.split(" ");
            if(str[0].equals("push")){
                stack.push(Integer.parseInt(str[1]));
            } else if(str[0].equals("pop")){
                stack.pop();
            } else if(str[0].equals("inc")){
                int x = Integer.parseInt(str[1]);
                int d = Integer.parseInt(str[2]);
                    stack.push((int) stack.remove(x -1) + d);
                }
            
            if(stack.size() > 0){
                System.out.println(stack.peek());
            } else {
                System.out.println("EMPTY");
            }
        }
        
        /*for(int i =0 ;i < stack.size();i++) {
        	System.out.print(stack.get(i) + " ");
        }*/
        

	}

}

