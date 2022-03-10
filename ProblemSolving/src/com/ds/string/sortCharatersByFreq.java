package com.ds.string;

import java.util.*;

class Pair {
    int count;
    char ch;
    public Pair (int count,char ch){
        this.count = count;
        this.ch = ch;
    }
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	
	
}
class pairComparator implements Comparator<Pair>{
	public int compare(Pair o1, Pair o2) {
		if(o1.getCount() < o2.getCount()){
			return 1;
		} else if(o1.getCount() > o2.getCount()){
			return -1;
		} else if(o1.getCh() < o2.getCh()){
			return 1;
		} else {
			return -1;
		}
	}
}

class sortCharatersByFreq {
    
    public static int findCharFreuencyInString(String s,char ch){
        int count =0;
        for(int i =0;i< s.length();i++){
            if(s.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
    
    @SuppressWarnings("unchecked")
	public static <T> String frequencySort(String s) {
        String res = "";
        List<Pair> st = new ArrayList<Pair>();
        for(int i =0;i < s.length();i++){
            int count = findCharFreuencyInString(s,s.charAt(i));
            Pair p = new Pair(count,s.charAt(i));
            st.add(p);
            
             
        }
        
       Collections.sort(st,new pairComparator());
        Iterator itr = st.iterator();
        while(itr.hasNext()) {
        	Pair p = (Pair) itr.next();
        	System.out.print(p.getCount() + " " + p.getCh());
        	System.out.println();
        	res= res + p.ch;
        }
		/*
		 * for(int i =0;i < s.length();i++){ System.out.println(st.get(i)); }
		 */
        
        return res;
    }
    public static void main(String[] args) {
		String s = "loveleetcode";
		System.out.println(frequencySort(s));
	}
}