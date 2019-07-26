package model;
import model.student;
public class main {
        public static void main(String[] args) {
            student student = new student();
            student.setName("duanyrian");
            student.setAge(23);
            student.setNumber(2017);
            //为什么运行结果两个整型都是0 QAQ
            student.setGender("女");
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getNumber());
            System.out.println(student.getGender());

    }
}
