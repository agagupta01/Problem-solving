package com.problems.recursion;

import java.util.*;

public class SubsequennceSum {

	public static void main(String[] args) {
	       int[] nums = {3,5,6,7};
	       int target = 9;
	            int [] res = new int[1];
	            List<Integer> ds = new ArrayList<Integer>();
	            recur(0,nums,target,res,ds);
	            System.out.println("HI " + res[0]);

	        }
	   


static void recur(int ind,int[] nums, int target,int[] res,List<Integer> ds){
    if(ind == nums.length-1){
        if(ds.size() >= 1){
            int sum = ds.get(0) + ds.get(ds.size()-1);
            if(sum <= target){
                res[0]++;
            }
        }
        return ;
    }

    recur(ind+1,nums,target,res,ds);

    ds.add(nums[ind]);
    recur(ind+1,nums,target,res,ds);
    ds.remove(ds.size()-1);

}




}







package com.tesco.store.fdcharityestimateservice.service;

import java.util.Comparator;
import java.util.HashMap;

public class demo {


    public static void main(String[] args) {
        String str = "absdfg";
        char [] arr = str.toCharArray();
        int st = 0,ed = str.length()-1;
        while(st < ed){
            char c = arr[st];
            arr[st] = arr[ed];
            arr[ed] = c;
            st++;
            ed--;
        }

        System.out.println(String.valueOf(arr));
    }




}

