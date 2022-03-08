package com.ds.array;

public class Demo {

	
public static boolean checkPossible(int [] cutomer){

  		
  		int count = 0 ;

		if(cutomer[0] > 5){
  			return false;
  		}
  		int sum = cutomer[0] ;
  		for(int i = 1 ; i < cutomer.length;i++){
  			sum = sum + cutomer[i];
			if(cutomer[i] - 5 <= sum){
				sum -= cutomer[i] - 5;
				
				continue;
			} else {
				return false;
			}
  		}

  		if(count == cutomer.length){
  			return true;
  		}

  		return false;
  	}

public static void main(String[] args) {
	int [] ars = {5,10,5};
	System.out.println(checkPossible(ars));
}
}


