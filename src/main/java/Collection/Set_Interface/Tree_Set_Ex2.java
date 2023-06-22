package Collection.Set_Interface;

import java.util.Objects;
import java.util.TreeSet;

public class Tree_Set_Ex2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet =new TreeSet<>();
        Student st1 = new Student("Zaur",5);
        Student st2 = new Student("Ivan",4);
        Student st3 = new Student("Mariya",2);
        Student st4 = new Student("Nikol",3);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

        Student st5 = new Student("Nastya",3);
        Student st6 = new Student("Oleg",5);

        //headSet vivodit vseh do st5
        System.out.println(treeSet.headSet(st5));
        //tailSet vivodit vseh posle st5
        System.out.println(treeSet.tailSet(st5));
        //subSet vivodit elementi mejdu st5 i st6
        System.out.println(treeSet.subSet(st5,st6));
    }
}
class Student implements Comparable<Student>{
    String name;
    int course;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.course-other.course;
    }
}