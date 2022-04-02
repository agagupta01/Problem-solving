package com.ds.array;


	
	class maxSum {
	    public static int maxAscendingSum(int[] nums) {
	        
	        int maxSum = 0;
	        int sum = 0;
	       int j= 0,i =0;
	        
	       while(i < nums.length){
	            sum = nums[i];
	            for( j = i+1;j < nums.length;j++){
	                if(nums[j] > nums[j-1] ){
	                    sum += nums[j];
	                    
	                } else {
	                   
	                    break;
	                }
	            }
	             i = j;
	             maxSum = Math.max(maxSum,sum);
	             //System.out.println(maxSum);
	            
	        }
	        
	        return maxSum;
	    }
	    
	    public static void main(String[] args) {
			int arr[] = {10,20,30,5,10,50};
			System.out.println(maxAscendingSum(arr));
		}
	}


