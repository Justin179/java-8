package com.learnJava.streams;

import java.util.*;

public class StreamsMaxMinExample {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6,7,8,9,10);
//        Optional<Integer> maxValue =maxValue(integers);
//        int max = maxValue.isPresent() ? maxValue.get():0;
//        System.out.println("Max Value is : " + max);

        Optional<Integer> minValue =minValue(integers);
        int min = minValue.isPresent() ? minValue.get():0;
        System.out.println("Min Value is : " + min);
    }
    public static Optional<Integer> minValue(List<Integer> integerList){

        Optional<Integer> reduce = integerList
                .stream()
                .reduce((a, b) -> a < b ? a : b);
        return reduce;


//        return integerList.stream()
//                .reduce((a,b)->(a<b) ? a : b);
                //.reduce(0,Integer::min);
    }

    public static Optional<Integer> maxValue(List<Integer> integerList){

        Optional<Integer> reduce = integerList
                .stream()
                .reduce((a, b) -> a > b ? a : b);
        return reduce;
//        return integerList.stream()
//                //.reduce(0,(a,b)->(a>b) ? a : b);
//        .reduce(Integer::max);
    }




}
