package com.ds.StringTest;

import java.io.*;
import java.util.*;


public class abc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());

            String out_ = Solve(N);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static String Solve(int N){
        // your code goes here
        String temp = "";

        ArrayList<String> tempResult = new ArrayList<>();
        
        for(int i = 44 ; i < 100000 ; i ++){
            temp = Integer.toString(i);
            
            if(fabString(temp) && (i % 2 == 0 || i % 5 == 0)){
            	if(!temp.contains("55") && !temp.contains("44"))
            		tempResult.add(temp);
            }
        }
        
        return tempResult.get(N);
    }
    
    static boolean fabString(String temp){
        String reverseString = new String();
        
        if(temp.length() % 2 == 0 && (temp.contains("5") || temp.contains("4"))) {
        for(int i = temp.length()-1 ; i >= 0 ;i--){
            if(temp.charAt(i) == '4' || temp.charAt(i) == '5'){
                reverseString = reverseString + temp.charAt(i);
            } else {
                return false;
            }
        }
        }
        
        if(temp.equals(reverseString)){
            return true;
        } else {
            return false;
        }
    }
    
}
