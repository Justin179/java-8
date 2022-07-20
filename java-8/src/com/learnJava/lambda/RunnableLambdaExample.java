package com.learnJava.lambda;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /**
         * Prior Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("T1");
            }
        };
        new Thread(runnable).start();


        //Java 8 - Lambda Syntax

        // ()->{}
        //assigning a lambda to a variable.

        Runnable t2 = () -> {
            System.out.println("T2");
        };
        new Thread(t2).start();

        Runnable t3 = () -> System.out.println("T3");
        new Thread(t3).start();

        new Thread(()-> System.out.println("T4")).start();

    }
}
