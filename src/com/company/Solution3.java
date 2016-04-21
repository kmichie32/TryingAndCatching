package com.company;

import java.io.*;
import java.util.*;


public class Solution3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberFromUser1 = scanner.nextInt();
        int numberFromUser2 = scanner.nextInt();
        int finalValue= 1;

        if( numberFromUser1 < 0 || numberFromUser2 <0){
            throw new IllegalArgumentException("n and p should be non-negative");
        }

        for(int i = 0; i < numberFromUser2; i++){
            finalValue *= numberFromUser1;
        }
        System.out.println(finalValue);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}