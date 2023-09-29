package SingleTon.EgerWay;

public class Test {
    public static void main(String[] args) {
        //create Object at times of loading class-if we do not need that object it will be weastage of memory

        System.out.println(Teacher.getTeacher().hashCode());
        System.out.println(Teacher.getTeacher().hashCode());
    }
}
