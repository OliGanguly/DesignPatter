package SingleTon.thread;

public class Test {
    public static void main(String[] args) {
//        Student student=new Student();
        //LAZY INITIALIZATION - CRETAE USER WHEN CLIENT WANTS
        Student student = Student.getStudent();
        System.out.println(student.hashCode());
        Student student1 = Student.getStudent();
        System.out.println(student1.hashCode());


    }
}
