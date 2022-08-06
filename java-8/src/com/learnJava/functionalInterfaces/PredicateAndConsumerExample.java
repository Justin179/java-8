package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;

    BiPredicate<Integer,Double> biPredicate = (gradeLevel,gpa) -> gradeLevel>=3&&gpa>=3.9;

    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);


    // 方法改以 Lambda 去寫，
    Consumer<Student> studentConsumer = (student) -> {

        if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
            studentBiConsumer.accept(student.getName(),student.getActivities());
        }

//        if(p1.and(p2).test(student)){
//            studentBiConsumer.accept(student.getName(),student.getActivities());
//        }
    };

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();

        new PredicateAndConsumerExample().printNameAndActivities(studentList);

    }
    public void printNameAndActivities(List<Student> studentList){

        studentList.forEach(studentConsumer);

    }



}
