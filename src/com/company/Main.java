package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Table name you want to print:");

        int table_1 = sc.nextInt();

        for (int i = 1; i <=10; i++){
            int total_sum = i * table_1;
            System.out.println("The table of "  + " " + table_1 +  " is : " + " " + table_1 +  " " +"* " + i + ": " + total_sum);
        }


    }
}
