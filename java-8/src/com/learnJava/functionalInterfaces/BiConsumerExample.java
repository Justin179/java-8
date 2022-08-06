package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        BiConsumer<String,String> biConsumer = (a,b) -> System.out.println(a+" "+b);
        biConsumer.accept("oo","xx");

        BiConsumer<Integer,Integer> multiply = (a,b) -> System.out.println(a*b);
        BiConsumer<Integer,Integer> division = (a,b) -> System.out.println(a/b);
        multiply.andThen(division).accept(10,5);



    }

    public static void nameAndActivities(){

        BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

        Consumer<String> stringConsumer = (name) -> System.out.println("name is  :" + name);

        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach((s) -> studentBiConsumer.accept(s.getName(),s.getActivities()));
    }

}
