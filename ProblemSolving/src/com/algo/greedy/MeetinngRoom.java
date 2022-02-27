package com.algo.greedy;

import java.util.*;

public class MeetinngRoom {
	
	public static void main(String[] args) {
		int [][] input = {{0, 5}, {1, 2}, {1, 10}} ;
		
		System.out.println(solve(input));
	}

    public static int solve(int[][] intervals) {

    Arrays.sort(intervals, Comparator.comparing((int[] itv) -> itv[0]));
 
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    int count = 0;
    for (int[] itv : intervals) {
        if (heap.isEmpty()) {
            count++;
            heap.offer(itv[1]);
        } else {
            if (itv[0] >= heap.peek()) {
                heap.poll();
            } else {
                count++;
            }
 
            heap.offer(itv[1]);
        }
    }
 
    return count;
    }
    
    
}
