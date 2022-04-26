package com.algo.microsoft;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Solution {

    public static void main(String[] args) {
        System.out.println("countFamilySeats" + familySeats(1, "1D 4C 5E"));
        
    }
    public static  int familySeats(int planeRows,String occupiedSeats){
            Map<Integer, String> seatMap = new HashMap<>();
            int countFamilySeats = 0;
        if (occupiedSeats == null || occupiedSeats.isEmpty()) {
            return planeRows * 3;
        }
          //for the Aisles : i have mentioned Z character
        for (int i = 1; i <= planeRows; i++) {
            String myData = new String("ABCZDEFGZHJK");
            seatMap.put(i, myData);
        }
        String[] occupiedSeatsArray = occupiedSeats.split(" ");
        
        System.out.println(seatMap.size());
        // int i=0;
        for (String occupied : occupiedSeatsArray) {
            char seatRow = occupied.charAt(0);
            char seatName = occupied.charAt(1);
            int row = Character.getNumericValue(seatRow);
            String seatNameCurrent = seatMap.get(row);

            String newSeatName = seatNameCurrent != null ? seatNameCurrent.replace(seatName, 'X') : null;
            System.out.println("Updating : " +newSeatName + " for row " + row);
            seatMap.put(row, newSeatName);
        }

        // AB?|DE?F|HJK
        for (Map.Entry<Integer, String> entry : seatMap.entrySet()) {
            
            String seatMapWithOccupiedData = entry.getValue();
            
            if (seatMapWithOccupiedData!=null && seatMapWithOccupiedData.contains("X")) {
                String[] tempSeatName = entry.getValue().split("X");
                for (String combinedSeats : tempSeatName) {
                    if (combinedSeats.length() <= 3) {
                        continue;
                    }
                    System.out.println("X is found : " + combinedSeats);
                    if (combinedSeats.length() >= 3 && !combinedSeats.contains("Z")) {
                        countFamilySeats++;
                    } else if (combinedSeats.length() >= 3 && combinedSeats.contains("Z")) {
                        String[] temp = combinedSeats.split("Z");
                        System.out.println(temp.length);
                        for (String t1 : temp) {
                            System.out.println("AISLE Separation " + t1);
                            if (t1.length() >= 3)
                                countFamilySeats++;
                        }
                    } else {
                        System.out.println("This portion is not suitable for family" + combinedSeats);
                    }

                }
            } else {
                countFamilySeats += 3;
            }

            System.out.println(" Till this row :"+entry.getKey()+"  family seats allowed :  " + countFamilySeats);
            
        }
        

   // enter code here
        return countFamilySeats;
    }

}