package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

//    static Consumer<Student>  c1= p -> System.out.println(p);
//    static Consumer<Student>  c2= p -> System.out.print(p.getName().toUpperCase());
//    static Consumer<Student>  c3= p -> System.out.println(p.getActivities());

        static Consumer<Student> c0 = s-> System.out.println(s);
        static Consumer<Student> c1 = s -> System.out.print(s.getName());
        static Consumer<Student> c2 = s -> System.out.println(s.getActivities());

    public static void printName(){

        List<Student> allStudents = StudentDataBase.getAllStudents();

        allStudents.forEach(c0);


    }

    public static void printNameAndActivities(){
        System.out.println("printNameAndActivities : ");

        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(c1.andThen(c2));

    }

    public static void printNameAndActivitiesUsingCondition(){
        System.out.println("printNameAndActivitiesUsingCondition : ");
        List<Student> personList = StudentDataBase.getAllStudents();

        personList.forEach(student -> {
            if (student.getGradeLevel()>=3 && student.getGpa()>3.9){
                c1.andThen(c2).andThen(c0).accept(student);
            }
        });
    }

    public static void main(String[] args) {

//        Consumer<String> consumer = s -> System.out.println(s);
//        consumer.accept("Justin");

//        printName();

//        printNameAndActivities();

        printNameAndActivitiesUsingCondition();
    }
}
