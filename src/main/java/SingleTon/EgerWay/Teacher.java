package SingleTon.EgerWay;

public class Teacher {
    //Eger way
    private  static Teacher teacher = new Teacher();
    public static Teacher getTeacher(){
        return teacher;
    }
}
