package com.learnJava.lambda;

import java.util.Comparator;

public class ComparatorLambda {

    public static int compareTwoIntegers(Comparator<Integer> comparator, int a, int b){

        return comparator.compare(a,b);
    }

    public static void main(String[] args) {

        /**
         * Prior JAVA 8
         */
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 ==
                // 1 o1>o2
            }
        };
        System.out.println(comparator.compare(1,2));


        /**
         * In JAVA 8
         */
        Comparator<Integer> comparator1 = (a,b)->a.compareTo(b);
        System.out.println(comparator1.compare(3, 3));


        /**
         * Comparator chaining happens only when the first comparators result is zero.
         */


    }
}
