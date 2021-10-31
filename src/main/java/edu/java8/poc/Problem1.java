package edu.java8.poc;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {

        int []arr ={1,2, 3, 4, 4, 5, 6 ,7, 8, 8, 9,9};

        Arrays.sort(arr);

        int tmp, j=0;

        for(int i=0; i<arr.length - 1;i++){

            if((arr[i] != arr[i+1] ) ){

                arr[j] = arr[i];
                j++;
            }
        }

        arr[j] = arr[arr.length -1];

        for(int i=0;i<=j;i++)
            System.out.println(arr[i]);
    }
}
