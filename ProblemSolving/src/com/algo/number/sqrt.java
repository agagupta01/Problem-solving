package com.algo.number;

public class sqrt {
	
	
	public static void main(String[] args) {
		
		System.out.println(srty(6));
        
	}
	
	
	public static int srty(int x) {
		
		if (x == 0 || x == 1)
            return x;
        
        int low = 0,mid = 0;
        int high = x;
        int ans=0;
        
        while(low <= high){
            
             mid = (low +high)/2;
            int c = mid * mid;
            if (c == x)
                return mid;
            else if(c < x){
                low = mid +1;
                ans = mid;
            }else 
                high = mid -1;
        }
        
        return ans;
        
	}

}
