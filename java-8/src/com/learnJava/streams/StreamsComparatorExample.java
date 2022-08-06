package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsComparatorExample {

    public static void main(String[] args) {
//        System.out.println("Students sorted by NAME");
//        sortStudentsByName().forEach(System.out::println);

//        System.out.println("Students sorted by GPA");
//        sortStudentsByGpa().forEach(System.out::println);
//
        System.out.println("Students sorted by GPA Higher to Lower");
        sortStudentsByGpaReversed().forEach(System.out::println);

    }

    public static List<Student> sortStudentsByName(){

        List<Student> students = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
        return students;

//       return  StudentDataBase.getAllStudents().stream()
//                .sorted(Comparator.comparing(Student::getName))
//                .collect(toList());
    }

    public static List<Student> sortStudentsByGpa(){

        List<Student> collect = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());

        return collect;
//        return  StudentDataBase.getAllStudents().stream()
//                .sorted(Comparator.comparing(Student::getGpa))
//                .collect(toList());
    }

    public static List<Student> sortStudentsByGpaReversed(){

        List<Student> collect = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
        return collect;

//        return  StudentDataBase.getAllStudents().stream()
//                .sorted(Comparator.comparing(Student::getGpa).reversed())
//                .collect(toList());
    }


}
