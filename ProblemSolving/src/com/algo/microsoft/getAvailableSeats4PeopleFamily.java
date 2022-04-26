package com.algo.microsoft;



//when u need to find nno of ways the family for 3 people can allocate the seat.
import java.util.*;
public class getAvailableSeats4PeopleFamily {

	public static void main(String[] args) {
		System.out.println(getAvailableSeats(1,"1A"));
	}

	public static int getAvailableSeats(int n, String s) {
		String str[] = s.split(" ");
		
		List<String> occupied = new ArrayList<>();
		int available = 0;

		occupied = Arrays.asList(str);
		

		for (int i = 1; i <= n; i++) {
			boolean increaseCount = true;

			if ((!occupied.contains(i + "B") && !occupied.contains(i + "C")) && (!occupied.contains(i + "D") && !occupied.contains(i + "E"))) {
				available++;
			}
			if (available == 0 && !occupied.contains(i + "D") && !occupied.contains(i + "E") && !occupied.contains(i + "F")  && !occupied.contains(i + "G")) {
				increaseCount = false;
				available++;
			}
			if (increaseCount && (!occupied.contains(i + "F") && !occupied.contains(i + "G")) && (!occupied.contains(i + "H") && !occupied.contains(i + "J"))) {
				available++;
			}
			
		}
		return available;
	}
}



//ABC DEFG HJK



