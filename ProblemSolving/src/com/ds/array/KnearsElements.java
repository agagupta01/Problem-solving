package com.ds.array;


import java.util.*;


class KnearsElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        int n= arr.length;
        int l = findCrossOver(arr,0,n-1,x);
        int count = 0;
        int r = l+1;
        
        if(arr[l] == k)
            l--;
        
        while(l>=0 && r < n && count < k){
            if(x - arr[l] < arr[r] - x){
                res.add(arr[l--]);
                
            }else {
                res.add(arr[r++]);
            }
            count++;
        }
        
        while(l>=0 && count < k){
            res.add(arr[l]);
            l--;
            count++;
        }
           
        
         while(r < n && count < k){
            res.add(arr[r]);
            r++;
            count++;
        }
             Collections.sort(res);
        return res;
    }
    
    public static int findCrossOver(int arr[],int low,int high,int x){
        
        if(arr[high] <= x)
            return high;
        if(arr[low] > x)
            return low;
            
            int mid = low +high >>1;
            
            if(arr[mid] <= x && arr[mid +1 ]> x){
                return mid;
            }
            
        if(arr[mid] < x){
          return  findCrossOver(arr,mid+1,high,x);
        
        }
        
        return  findCrossOver(arr,low,mid-1,x);
        
    }
}