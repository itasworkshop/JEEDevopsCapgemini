package org.mypackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

class Student{
    String name;
    String college;

    public Student(String name, String college) {
        this.name = name;
        this.college = college;
    }
}
class University{
    ArrayList<Student> studentList=new ArrayList<>();
    public HashMap<String,Integer> groupByCollege() {
        int count = 0;
        HashMap<String, Integer> studentMap = new HashMap<>();
        for (Student st : studentList) {
            studentMap.putIfAbsent(st.college, count);
        }
        System.out.println(studentMap);
        return  studentMap;
    }
}


public class CollegeStudentCounter {

    public void studentFromCollege(String collegeName) {
        ArrayList<String> arrayList = new ArrayList<>();
    }

    public static void main(String[] args) {
        Student data1 = new Student("Amit", "Stanford");
        Student data2 = new Student("Bob", "Stanford");
        Student data3 = new Student("Steve", "Harvard");
        Student data4 = new Student("A1ice", "Harvey Mudd");
        University obj = new University();
        obj.studentList.add(data1);
        obj.studentList.add(data2);
        obj.studentList.add(data3);
        obj.studentList.add(data4);

        System.out.println(obj.groupByCollege());


    }
}
