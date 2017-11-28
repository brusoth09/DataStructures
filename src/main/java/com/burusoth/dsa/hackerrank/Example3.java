package com.burusoth.dsa.hackerrank;


public class Example3 {
    static long mod = 10000000007l;

    public static void main(String[] args) {
        System.out.println(consecutive(10000000000l));
    }

    static int consecutive(long num) {
        int count = 0;
        for (long i = 1; i * (i + 1) < 2 * num; i++) {
            float startValue = (float) ((1.0 * num / (i + 1) - (i / 2)));
            if (startValue - (int) startValue == 0.0) {
                count++;
            }
        }
        return count;
    }


    static String longestEvenWord(String sentence) {
        String[] words = sentence.split("\\s+");
        int max = 0;
        String result = "00";
        for (String word : words) {
            if (word.length() % 2 == 0 && word.length() > max) {
                result = word;

            }
        }
        return result;
    }

    static String lastLetters(String word) {
        int len = word.length();
        return null;
    }

    static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Fizz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n);
            }
        }
    }


}
