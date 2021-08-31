package com.ds.linkedlist;

public class test4 {

	public static void main(String[] args) {
		
		int p =0 , n =0, z=0;
		int arr[] = {1,2,3};
        int total = arr.length;
        for(int i : arr){
            if(arr[i] < 0){
                n++;
            } else if(arr[i] > 0){
                p++;
            } else {
                z++;

            }
            System.out.println();
            System.out.println(p/total);
            System.out.println(n/total);
            System.out.println(z/total);
            
        }  
            
        
	}
}
