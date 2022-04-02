package com.ds.array;


//Given an unsorted integer array nums, return the smallest missing positive integer.

//You must implement an algorithm that runs in O(n) time and uses constant extra space.

class firstMissingPositive {
    public int firstMissingPositive(int[] arr) {
        
    int n = arr.length;
        
    int ptr = 0;
 
    // Check if 1 is present in array or not
    for(int i = 0; i < n; i++)
    {
        if (arr[i] == 1)
        {
            ptr = 1;
            break;
        }
    }
 
    // If 1 is not present
    if (ptr == 0)
        return (1);
 
    // Changing values to 1
    for(int i = 0; i < n; i++)
        if (arr[i] <= 0 || arr[i] > n)
            arr[i] = 1;
 
    // Updating indices according to values
    for(int i = 0; i < n; i++)
        arr[(arr[i] - 1) % n] += n;
 
    // Finding which index has value less than n
    for(int i = 0; i < n; i++)
        if (arr[i] <= n)
            return (i + 1);
 
    // If array has values from 1 to n
    return (n + 1);
    }
}