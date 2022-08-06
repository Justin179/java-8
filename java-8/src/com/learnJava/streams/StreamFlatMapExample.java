package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamFlatMapExample {

    public static void main(String[] args) {


        System.out.println("Student Activities : " + printStudentActivities());
//        System.out.println("Unique Student Activities : " + printUniqueStudentActivities());
//        System.out.println("Unique Student Activities Count: " + getStudentActivitiesCount());

    }

    public static List<String> printStudentActivities() {

        List<String> strings = StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .collect(toList());

        return strings;

//        List<String> studentActivities = StudentDataBase.getAllStudents()
//                .stream()
//                .map(Student::getActivities) //Stream<List<String>>
//                .flatMap(List::stream) //<Stream<String>
//                .collect(toList());
//
//        return studentActivities;

    }

    public static List<String> printUniqueStudentActivities() {

        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());

        return studentActivities;

    }

    public static long getStudentActivitiesCount() {

        long totalActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();

        return totalActivities;

    }



}
