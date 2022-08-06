package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>>  function = (students -> {

        Map<String,Double> map = new HashMap<>();
        students.forEach(student -> {
            if (PredicateStudentExample.p1.test(student)){
                map.put(student.getName(),student.getGpa());
            }
        });

        return map;
    });
    public static void main(String[] args) {

        Map<String,Double> map = function.apply(StudentDataBase.getAllStudents());
        System.out.println(map);


    }

//    static Function<List<Student>, Map<String, Double>>  function = (students -> {
//
//        Map<String,Double> studentGradeMap = new HashMap<>();
//        students.forEach((student -> {
//
//            if(PredicateStudentExample.p1.test(student)){
//                studentGradeMap.put(student.getName(),student.getGpa());
//            }
//        }));
//
//        return studentGradeMap;
//
//    });

}
