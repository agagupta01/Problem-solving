package com.ds.hashing;

import java.util.*;

public class LargestContinuousSequenceZeroSum {
	
	 public static void main(String[] args) {
		 int [] innput = {3,1,3,4,5}; 
		 System.out.println(lszero(innput));
	}

    public static int[] lszero(int[] A) {
        
        ArrayList<Pair> out = Pair.findSubArrays(A, A.length);
        int [] res = null;
        if(out.size() > 0){
        int cnt =0 ,ind =0;
        for(int j=0;j< out.size();j++){
            Pair pp = out.get(j);
            if(pp.second-pp.first > cnt){
                cnt = pp.second-pp.first;
                ind = j;
            }
        }
        Pair p = out.get(ind);
        res = new int[cnt+1];
        for(int j=0,i = p.first;i<=p.second;i++,j++){
            
            res[j]=A[i];
        }} else {
            res = new int[0];
        }
        return res;
    }
}

class Pair
{
    int first, second;
    Pair(int a, int b)
    {
        first = a;
        second = b;
    }
    static ArrayList<Pair> findSubArrays(int[] arr, int n)
    {
            // create an empty map
            HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
 
            // create an empty vector of pairs to store
            // subarray starting and ending index
            ArrayList<Pair> out = new ArrayList<>();
 
            // Maintains sum of elements so far
            int sum = 0;
 
            for (int i = 0; i < n; i++)
            {
                // add current element to sum
                sum += arr[i];
 
                // if sum is 0, we found a subarray starting
                // from index 0 and ending at index i
                if (sum == 0)
                    out.add(new Pair(0, i));
                ArrayList<Integer> al = new ArrayList<>();
                 
                // If sum already exists in the map there exists
                // at-least one subarray ending at index i with
                // 0 sum
                if (map.containsKey(sum))
                {
                    // map[sum] stores starting index of all subarrays
                    al = map.get(sum);
                    for (int it = 0; it < al.size(); it++)
                    {
                            out.add(new Pair(al.get(it) + 1, i));
                    }
                }
                al.add(i);//2
                map.put(sum, al);//1,(0)),(3,(1)),(5,(3)),
            }
            return out;//(1,2),(3,4)
    }
    //{1 ,2 ,-2 ,4 ,-4}
}
