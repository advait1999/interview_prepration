package com.mock.mock;

import java.util.HashSet;

import java.util.Set;

public class SumFinder {

    public static void main(String[] args) {
        int[] number={1,2,3,4,5,6,7,8};
        int target=9;
        findPairsWithSet(number,target);
    }

    public static void findPairsWithSet(int[] numb,int target){

        Set<Integer> st=new HashSet<>();
        for (int num:numb){
            int value=target-num;
            if (st.contains(value)){     // Check for value
                System.out.println(value+" + "+num+" = "+target);
            }
            st.add(num); // Add current number after checking
        }
    }



    //Time Complexity: O(n) - Single pass through the array with O(1) set operations
}
