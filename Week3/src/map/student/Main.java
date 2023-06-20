package map.student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("a", 10, "a");
        Student student2 = new Student("b", 20, "b");
        Student student3 = new Student("c", 30, "c");

        Map<Integer,Student> studentMap=new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);

        for (Map.Entry<Integer,Student> studentEntry: studentMap.entrySet()){
            System.out.println(studentEntry.toString());
        }

        System.out.println("=====Set=====");
        Set<Student> studentSet=new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);

        for (Student student:studentSet){
            System.out.println(student.toString());
        }
    }
}
