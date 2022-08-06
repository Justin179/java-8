package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Predicate;

public class StreamsFilterMapReduceExample {
    public static void main(String[] args) {

        System.out.println("Total No of NoteBooks are : " + noOfNoteBooks());
    }

    private static int noOfNoteBooks(){

        Integer reduce = StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel()>3)
                .map(Student::getNoteBooks)
                .reduce(0,Integer::sum);
//                .reduce(0, (a, b) -> a + b);
        return reduce;

    }

    static Predicate<Student> genderPredicte =(student -> {
        return student.getGender().equals("male");
    });

    static Predicate<Student> gradeLevel =(student -> {
        return student.getGradeLevel()==2.0;
    });



}
