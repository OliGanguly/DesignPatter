package Factory;

public class Doctor implements Profession{
    @Override
    public void printMe() {
        System.out.println("I am a Doctor");
    }
}
