package Lamda;

import java.util.ArrayList;

public class Student_Info {
    void testStudents(ArrayList<Student> al, StudentChecs sc){
        for (Student s:al){
            if (sc.check(s)){
                System.out.println(s);
            }
        }
    }

//    void printStudentsOverGrade(ArrayList<Student> al,double grade){
//        for(Student s:al){
//            if (s.avgGrade>grade){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsUnderAge(ArrayList<Student> al,int age){
//        for(Student s:al){
//            if (s.age<age){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsMixCondition(ArrayList<Student> al,int age,double grade,char sex){
//        for(Student s:al) {
//            if (s.avgGrade > grade && s.age<age && s.sex==sex) {
//                System.out.println(s);
//            }
//        }
//    }
}
class Test{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',25,5,7.8);
        Student st2 = new Student("Danik",'m',18,4,8.9);
        Student st3 = new Student("Nikolay",'m',23,2,7.5);
        Student st4 = new Student("Elena",'f',30,1,7.3);
        Student st5 = new Student("Nikol",'f',20,3,9.2);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        Student_Info info = new Student_Info();
//        info.testStudents(students, new StudentChecs() {
//            @Override
//            public boolean check(Student s) {
//                return s.avgGrade<8;
//            }
//        });
        info.testStudents(students,(Student s)-> {return s.avgGrade>8;});
        System.out.println("***********************************************");

        info.testStudents(students,(Student s)-> {return s.age<30;});
        System.out.println("***********************************************");
        info.testStudents(students,(Student s)-> {return s.avgGrade > 7 && s.age>20 && s.sex=='m';});

//        info.printStudentsOverGrade(students,8);
//        System.out.println("***********************************************");
//        info.printStudentsUnderAge(students,24);
//        System.out.println("***********************************************");
//        info.printStudentsMixCondition(students,25,8,'m');
    }
}
interface StudentChecs{
    boolean check(Student s);
}