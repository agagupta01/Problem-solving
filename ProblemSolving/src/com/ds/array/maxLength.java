package com.ds.array;

import java.util.*;

class maxLength {
    public static int maxLength(List<String> arr) {
        int maxi = 0;
        boolean duplicate = false;
        
        if(arr.size() == 1) return arr.get(0).length();
        
        for(int i = 0;i < arr.size();i++){
            String curr = arr.get(i);
            
            duplicate = false;
            System.out.println(" curr :" + curr);
            
            
            
            HashSet<Character> st = new HashSet<>();
            for(int a = 0;a < curr.length();a++){
                st.add(curr.charAt(a));
            }
            
            String curr1 = "";
            for(int j = i+1;j < arr.size();j++){
                curr1 = arr.get(j);
                System.out.println(" curr1 :" + curr1);
                for(int a =0;a < curr1.length();a++){
                    if(st.contains(curr1.charAt(a))){
                        duplicate = true;
                        break;
                    }
                }
            }
            if(!duplicate){
                maxi = Math.max(maxi,curr.length() + curr1.length());
                System.out.println("maxi : " + maxi);
            }
            
            st.clear();
        }
        
        return maxi;
    }
    
    public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("un");
		l.add("iq");
		l.add("ue");
		System.out.println("last :" + maxLength(l));
		
	}
}