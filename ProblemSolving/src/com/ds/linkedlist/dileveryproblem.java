package com.ds.linkedlist;

import java.util.*;

public class dileveryproblem {

	public static void main(String[] args) {
		
		List<String> eventDetails = new ArrayList<>();
		
		eventDetails.add("8 10");
		eventDetails.add("2 3");
		eventDetails.add("4 5");
		eventDetails.add("11 12");
		eventDetails.add("3 4");
		eventDetails.add("5 6");
		eventDetails.add("6 7");
		eventDetails.add("8 9");
		eventDetails.add("10 11");
		eventDetails.add("7 8");
		eventDetails.add("1 4");
		
		
		int count = 0;
		List<Integer> Startresult = new ArrayList<Integer> ();
		List<Integer> Endresult = new ArrayList<Integer> ();
		for(String s : eventDetails) {
			String start = s.substring(0, s.indexOf(" "));
			String end = s.substring(s.indexOf(" ")+1);
				
				Startresult.add(Integer.parseInt(start));
				Endresult.add(Integer.parseInt(end));
				
		}
		
		Collections.sort(Startresult);
		Collections.sort(Endresult);
		
		 
		Iterator<Integer> i = Startresult.listIterator();
		Iterator<Integer> j = Endresult.listIterator();
		int a = 0 ,b =0;
		
		System.out.println(Startresult);
		System.out.println(Endresult);
		
		int iteration = 1;
		while(i.hasNext() && j.hasNext()) {
			
			if(iteration == 1) {
				a = i.next();
				b = j.next();
				if(a < b) {
					count++;
					System.out.println(count);
					a = b;
				}
					
			} else {
				b = i.next();
				if(a < b ) {
					if(++a != b) {
						a  = b;
						count++;
						System.out.println(count);
					} else {
						--a;
					}
				}
			}
			
			iteration++;
		}
		
		
		System.out.println(count);
		

	}

}
