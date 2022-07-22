package com.Java_Collection;

import java.util.Arrays;

public class _9ArrayClass {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(numbers,4); // O(log n)

        System.out.println("The Index of element 4 in the array is: "+ index);

        Integer[] num = {10,2,32,12,15,76,17,48,79,90};
        Arrays.sort(num);

        Arrays.fill(num,12); // all elements are replaced in 12 in num arrays

        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}
