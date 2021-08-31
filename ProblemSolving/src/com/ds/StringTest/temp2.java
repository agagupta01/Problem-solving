package com.ds.StringTest;

import java.util.ArrayList;
import java.util.*;

public class temp2 {

	
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(3);
		a.add(2);
		System.out.println(a.size());
 		Collections.sort(a);
        List<Integer> a_new = a;
        int i = a_new.size() -1 ;
        while(i > 1 ){
            if(a_new.get(i) == a_new.get(i-1)){
                a_new.remove(i);
                a_new.remove(i-1);
            } else if(a_new.get(i) > a_new.get(i-1)){
                a_new.set(i, a_new.get(i) - a_new.get(i-1));
                a_new.remove(i-1);
            } else if(a_new.get(i) < a_new.get(i-1)){
                 a_new.set(i-1, a_new.get(i-1) - a_new.get(i));
                a_new.remove(i);
            }

            i = a_new.size();
        }
        System.out.println(i);
    }
	
}
