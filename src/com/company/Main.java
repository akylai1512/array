package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum =scan.nextInt();
        int[] arr = new int[]{0,1,1,2,3,5,7};

        for (int i=0; i<arr.length; i++){
         for (int j=i+1; j<arr.length; j++){
             int l =i+j;
             if(l==sum){
                System.out.println(i+";"+j);
             }
         }
        }
    }
}
