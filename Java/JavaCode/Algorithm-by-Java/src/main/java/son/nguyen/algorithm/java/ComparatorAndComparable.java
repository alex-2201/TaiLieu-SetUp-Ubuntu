/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package son.nguyen.algorithm.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author thena
 */

public class ComparatorAndComparable {
    public static void main(String[] args) {
        List<StudentImplementComparable> listStudentImplementComparables = new ArrayList<>();
        listStudentImplementComparables.add(new StudentImplementComparable(1, "Vinh", 19, "Hanoi"));
        listStudentImplementComparables.add(new StudentImplementComparable(2, "Hoa", 19, "Hanoi"));
        listStudentImplementComparables.add(new StudentImplementComparable(3, "Phu", 20, "Hanoi"));
        listStudentImplementComparables.add(new StudentImplementComparable(4, "Quy", 22, "Hanoi"));
        
        Collections.sort(listStudentImplementComparables);
        listStudentImplementComparables.forEach(System.out::println);
        
        System.out.println("-----------------------------------------");
        
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student(1, "Vinh", 19, "Hanoi"));
        listStudents.add(new Student(2, "Hoa", 19, "Hanoi"));
        listStudents.add(new Student(3, "Phu", 20, "Hanoi"));
        listStudents.add(new Student(4, "Quy", 22, "Hanoi"));
        
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        listStudents.forEach(System.out::println);
        
    }
}
