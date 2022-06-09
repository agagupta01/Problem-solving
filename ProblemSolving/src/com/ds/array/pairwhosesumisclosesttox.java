package com.ds.array;


import java.util.*;
/**
 * 
 * 
 * Given a sorted array and a number x , find a pair whose sum is closest to x. 

Input : {10, 22, 28, 29, 39, 49}
X = 54 
Output : 22 and 29 

Input :{-6,-3, -2, 28, 29, 30, 57}
X = 54 
Output : -6 and 57 

 * 
 * */
class pairwhosesumisclosesttox {
    
    public List<Integer>  solution(int arr[],int x) {
        
        List<Integer> resList = new ArrayList<>();
        int i = 0,j = arr.length-1;
        int minSum = 0;
        while(i < j){
            if((arr[i] + arr[j]) == x){
                resList.clear();
                resList.add(i);
                resList.add(j);
                return resList;
            } else if((arr[i] + arr[j]) > x){
                i++;j--;
            } else if((arr[i] + arr[j]) < x){
                if(minSum < (arr[i] + arr[j]) ){
                    minSum = (arr[i] + arr[j]);
                    resList.clear();
                    resList.add(arr[i]);
                    resList.add(arr[j]);
                }
                i++;j--;
            }
        }
        
        return resList;
    }
}

class pairwhosesumisclosesttoxDemo {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String line = myObj.nextLine();
        pairwhosesumisclosesttox s = new pairwhosesumisclosesttox();
        int arr [] = {-6,-3, -2, 28, 29, 30, 57};
        int x = 54;
        
        List<Integer> itrList = s.solution(arr,x);
        Iterator itr = itrList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}