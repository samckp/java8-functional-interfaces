package edu.java8.poc;

// Netcracker Interview on 5th-October-2021

public class StarPattern {
    public static void main(String[] args) {

            int i, j, n=5;

            for(i=0; i<n; i++) //an outer loop for number of rows(n)
            {
                for(j=2*(n-i); j>=0; j--) // an inner loop for spaces
                {
                    System.out.print(" "); // to print space
                }
                for(j=0; j<=i; j++) // an inner loop for columns
                {
                    System.out.print("* "); // to print star
                }
                 System.out.println(); // end-line after every row
            }
        }
    }
