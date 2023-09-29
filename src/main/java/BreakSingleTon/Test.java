package BreakSingleTon;

public class Test {
    public static void main(String[] args) {
      SingleTon s1 =  SingleTon.getSingleTon();
        SingleTon s2 =  SingleTon.getSingleTon();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
