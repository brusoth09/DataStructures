package com.burusoth.dsa.hackerrank;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example1 {
    private static void findPossibilities(int number, String[] array){
        Map<Integer,Integer> values = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i = 0; i < array.length; i++){
            values.put(Integer.parseInt(array[i]), (values.get(Integer.parseInt(array[i])) == null)? 1 : values.get(array[i]) + 1);
        }

        for(int i=0; i < array.length; i++){
            if(values.get(Math.abs(Integer.parseInt(array[i]) + number)) != null){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] array = scanner.nextLine().split(" ");
        findPossibilities(n, array);
    }
}
