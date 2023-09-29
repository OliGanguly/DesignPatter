package SingleTon.Lazy;

public class Student {
    //1.stop default constructor
    //cannot call constructor
    static private  Student student;
//    private Student(){
//
//    }
    private Student(){

    }
    //2.make it static so that call it without object
    public static Student getStudent(){
        //Create Object of this class
        //will run once only
           if(student==null){
                student = new Student();
           }
        return student;
    }
}
/*
* 1.Constructor private
* 2.Object create with help of method which return object
* 3.Create field to store object as private
* */
