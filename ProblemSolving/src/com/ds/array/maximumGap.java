package com.ds.array;

import java.util.Arrays;

public class maximumGap {

	public static void main(String[] args) {
		
		System.out.println(maxGap());
		
	}
	
	public static int maxGap() {
		int[] test = {5, -2, 3 , 1, 2};
		
		
		if(test.length < 2)
			return 0;
		
		int min =test[0],max=0;
		for(int i =0;i <test.length;i++) {
			if(min > test[i])
				min = test[i];
			
			if(max < test[i])
				max = test[i];
		}
		
		int interval = (int) Math.ceil((max-min+0.0)/(test.length -1));
		
		System.out.println(min);
		System.out.println(max);
		
		int[] bucketMin = new int[test.length];
		Arrays.fill(bucketMin,Integer.MAX_VALUE);
		
		int[] bucketMax = new int[test.length];

		Arrays.fill(bucketMax,-1);
		
		for(int i =0;i <test.length;i++) {
			if(test[i]== min || test[i]==max) {
				continue;
			}
			
			int index = (test[i]-min)/interval;
			
			bucketMin[index] = Math.min(bucketMin[index],test[i]);
			bucketMax[index] = Math.max(bucketMax[index],test[i]);
		}
		
		int prev=min;
		int maxGap = 0;
		for(int i =0;i <test.length;i++) {
			
			if(bucketMax[i]==-1)continue;
			maxGap = Math.max(maxGap,bucketMin[i] - prev);
			prev=bucketMax[i];
		}
		
		
		maxGap = Math.max(max-prev,maxGap);
		
		return maxGap;
	}
}
