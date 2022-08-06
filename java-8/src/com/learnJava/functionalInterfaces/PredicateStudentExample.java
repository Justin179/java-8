package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateStudentExample {
    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;

    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;
    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();



    }


    static Function<Integer,Predicate<Integer>> gradePredicate = (toCompare) -> (number) -> number > toCompare;
    static Function<Double,Predicate<Double>>  gpaPredicate = (toCompare) -> (number) -> number > toCompare;


}
