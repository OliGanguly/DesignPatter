package Factory;

public class Test {
    public static void main(String[] args) {
//        Profession p = new Engineer();
//        p.printMe();
    ProfessionFactory professionFactory = new ProfessionFactory();
    Profession doc = professionFactory.getProfession("Doctor");
      doc.printMe();
    }
}
