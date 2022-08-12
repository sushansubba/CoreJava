package day4;

public class SchoolApp {


    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setName("Sushan");
        student1.setRollNumber(1);
        student1.setAge(24);
        student1.setStudentClass("Java");
        student1.takeLeave();



        Teacher teacher1 = new Teacher();


        teacher1.setName("Taman");
        teacher1.setAge(30);
        teacher1.setSubject("Java");
        teacher1.takeLeave();


    }
}
