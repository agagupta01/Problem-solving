package com.oops.problm;

import java.util.*;
import java.util.concurrent.*;

//nput: nums = [1,3,-1,-3,5,3,6,7], k = 3    


class maxSliidngWindow{

public static void main(String args[]){

  int [] nums = {1,3,-1,-3,5,3,6,7};
  int k = 3 ;
  int [] res = maxSliidngWindow(nums,k);
  
  for(int i =0;i < res.length;i++)
      System.out.println(res[i]);

}

public static int [] maxSliidngWindow(int [] nums,int k){

  int n = nums.length;
  int ri = 0;
  int [] res = new int [n-k+1];

  Deque<Integer> dequeue = new ArrayDeque<Integer>();
  
  for(int i =0;i < nums.length;i++){
  
      if(!dequeue.isEmpty() && dequeue.peek() == i-k){
          dequeue.poll();
      }
  
  
      while(!dequeue.isEmpty() && nums[dequeue.peekLast()] < nums[i])
            dequeue.pollLast();
          
 
       dequeue.offer(i);
       
       if(i >=k-1)
           res[ri++] = nums[dequeue.peek()];
  
  }
  return res;

}


}