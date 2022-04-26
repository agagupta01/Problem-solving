package com.algo.microsoft;



//when u need to find nno of ways the family for 3 people can allocate the seat.
import java.util.*;
public class getAvailableSeats {

	public static void main(String[] args) {
		System.out.println(getAvailableSeats(1,""));
	}

	public static int getAvailableSeats(int n, String s) {
		String str[] = s.split(" ");
		List<String> occupied = new ArrayList<>();
		int available = 0;

		occupied = Arrays.asList(str);

		for (int i = 1; i <= n; i++) {

			if (!occupied.contains(i + "A") && !occupied.contains(i + "B") && !occupied.contains(i + "C")) {
				available++;
			}
			if (!(occupied.contains(i + "D") && occupied.contains(i + "G"))
					&& !(occupied.contains(i + "E") || occupied.contains(i + "F"))) {
				available++;
			}
			if (!occupied.contains(i + "H") && !occupied.contains(i + "J") && !occupied.contains(i + "K")) {
				available++;
			}
		}
		return available;
	}
}



//ABC DEFG HJK