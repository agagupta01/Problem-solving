package com.ds.array;



import java.util.*;
/**
 * 
 * 
 You are given an integer array arr of numbers sorted in ascending order and a target number x.

Suppose that nums is rotated at some pivot unknown to you beforehand (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]

If x  is found then return its index 
Otherwise return -1 

findindexInrotatedarray

Input: arr = [4,5,6,7,0,1,2], x = 0
Output: 4
Input: arr = [4,5,6,7,0,1,2], x = 3
Output: -1
-----------------------------------------------------------------


Given a sorted array and a number x , find a pair whose sum is closest to x. 

Input : {10, 22, 28, 29, 39, 49}
X = 54 
Output : 22 and 30 

Input :{-6,-3, -2, 28, 29, 30, 57}
X = 54 
Output : -6 and 57 

 * 
 * */
class findindexInrotatedarray {
    
    public static int solution(int [] arr,int x) {
        int pivot_el = 0,pivot_in= 0; 
        for(int i =0;i < arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                continue;
            }else {
                pivot_in = i;
                pivot_el = arr[i];
                break;
            }
        }
        int n = arr.length;
        int l = arr[0],h =arr[n-1];
        if(x >= l && x <= pivot_el){
           return binary_serach(arr,l,pivot_in,x);
        } else if(x >= arr[pivot_in+1] && x <= h){
           return binary_serach(arr,pivot_in+1,n-1,x);
        } else {
            return -1;
        }
        
    }
    
    
    public static int binary_serach(int [] arr,int l,int h,int x){
        int res = -1;
        while(l <= h){
            int mid = l+h >>1;
            
            if(arr[mid] == x){
                return res = mid;
            } else if(arr[mid] < x){
                l = mid+1;
                
            } else {
                h = mid -1;
            }
        }
        
        return res;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String line = myObj.nextLine();

       // int ans = new Solution().solution(line);
        
        findindexInrotatedarray s = new findindexInrotatedarray();
        int arr [] = {4,5,6,7,0,1,2};
        int x = 3;
        
        System.out.print(s.solution(arr,x));
    }
}