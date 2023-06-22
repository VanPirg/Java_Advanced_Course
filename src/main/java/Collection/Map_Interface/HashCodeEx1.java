package Collection.Map_Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student,Double> map = new HashMap<>();
        Student st1 = new Student("Zaur","Tregulov",3);
        Student st2 = new Student("Mariya","Ivanova",1);
        Student st3 = new Student("Sergey","Petrov",4);
        map.put(st1,7.5);
        map.put(st2,8.7);
        map.put(st3,9.2);
        System.out.println(map);
        Student st4 = new Student("Zaur","Tregulov",3);
        boolean result = map.containsKey(st4);
        System.out.println("Result = "+result);
        for (Map.Entry<Student, Double> entry: map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
class Student implements Comparable<Student>{
    String name;
    String surmane;
    int course;

    public Student(String name, String surmane, int course) {
        this.name = name;
        this.surmane = surmane;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surmane='" + surmane + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surmane, student.surmane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surmane, course);
    }


    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}