package SingleTon.Lazy;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception{
//        Student student=new Student();
        //LAZY INITIALIZATION - CRETAE USER WHEN CLIENT WANTS
//        Student student = Student.getStudent();
//        System.out.println(student.hashCode());
//        Student student1 = Student.getStudent();
//        System.out.println(student1.hashCode());
         //break
        /*
        * 1.Reflection api
        * solution - if object exist throw exception from inside constructor
        * 2.use Enum
        * */
        Student s1=Student.getStudent();
        System.out.println(s1.hashCode());

//        Constructor<Student> declaredConstructor = Student.class.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//        Student s2 = declaredConstructor.newInstance();
//        System.out.println(s2.hashCode());


    }
}
