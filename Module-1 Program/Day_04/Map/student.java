package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class student implements Comparable<student> {
    @Override
    public int compareTo(student o) {
        return this.age - o.age;
    }

    String name;
    int rno;
    int age;
    int marks;

    public student(String name, int rno, int age, int marks) {
        this.name = name;
        this.rno = rno;
        this.age = age;
        this.marks = marks;

    }



    public String toString() {
        return "Student {Name " + name + ", Rno" + rno + ", Age" + age + ", Marks" + marks + "}";
    }
}
 class main{
    public static void main(String[] args) {
        ArrayList<student> students = new ArrayList<student>();
        students.add(new student("nikhil" , 126, 21, 99 ));
        students.add(new student("anshul" , 123, 22, 90 ));
        students.add(new student("nitin" , 122, 23, 99 ));
        students.add(new student("sarthak" , 121, 20, 94 ));

        System.out.println("before sorting");
        for (student s: students) {
            System.out.println(s);
        }
        // sorting
        students.sort(Comparator.comparingInt(s -> s.age));
        System.out.println("\n--- After Sorting By Age ---");
        for (student s : students) {
            System.out.println(s);
        }


    }
}