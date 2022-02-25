package com.algo.greedy;

import java.util.Arrays;

public class DistributeCandy {
    public int candy(int[] A) {

    int candies = 0;
    int size = A.length;
    int[] lefttoright = new int[size];
    int[] righttoleft = new int[size];

    Arrays.fill(lefttoright,1);
    Arrays.fill(righttoleft,1);
    
    for (int l = 1; l<size; ++l)
        if (A[l] > A[l-1])
            lefttoright[l] = lefttoright[l-1] + 1;
    
    for (int r = size-2; r>=0; --r)
        if (A[r] > A[r+1])
            righttoleft[r] = righttoleft[r+1] + 1;
            
    for (int i = 0; i<size; ++i)
        candies += Math.max(lefttoright[i], righttoleft[i]);
    return candies;
    }
}
