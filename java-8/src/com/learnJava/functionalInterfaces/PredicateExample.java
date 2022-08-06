package com.learnJava.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {








    static Predicate<Integer> p1 = (i) -> i%2 ==0;

    static Predicate<Integer> p2 = (i) -> i%5 ==0;
    public static void main(String[] args) {

//        Predicate<Integer> predicate = a -> a%2 == 0;
//        System.out.println(predicate.test(10));
        predicateAnd();
        predicateOr();
        predicateNegate();

    }
    public static void predicateAnd(){

        System.out.println("Result in predicateAnd : " + p1.and(p2).test(10));
    }

    public static void predicateOr(){

        System.out.println("Result in predicateOr : " + p1.or(p2).test(4));
    }

    public static void predicateNegate(){

        System.out.println("Result in predicateNegate : " + p1.and(p2).negate().test(10)); //equivalent to reversing the result
    }


}
