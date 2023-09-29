package BreakSingleTon;

public class BreakSingleTonDesignPattern {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getSingleTon();
        SingleTon duplicate = SingleTon.getSingleTon();

        System.out.println(singleTon.hashCode());
        System.out.println(duplicate.hashCode());

        //ways to break
       // 1.Reflection
        SingleTon.class.getDeclaredConstructor();


    }
}
