package model;
import model.student;
public class main {
        public static void main(String[] args) {
            student student = new student();
            student.setName("duanyrian");
            student.setAge(23);
            student.setNumber(2017);
            //大小写还能弄错是不是傻
            student.setGender("女");
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getNumber());
            System.out.println(student.getGender());

    }
}
