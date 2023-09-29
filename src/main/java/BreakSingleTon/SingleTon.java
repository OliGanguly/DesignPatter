package BreakSingleTon;

public class SingleTon {
    private static SingleTon singleTon;
    private SingleTon(){}
    public static SingleTon getSingleTon(){
      if(singleTon==null){
       synchronized (SingleTon.class){
          if(singleTon==null){
              singleTon=new SingleTon();
          }
       }
      }
      return singleTon;
    }

}
