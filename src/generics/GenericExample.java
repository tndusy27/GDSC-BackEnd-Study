package generics;

import java.util.ArrayList;
import java.util.List;

// 제네릭(Generic) : 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것
//public class GenericExample {
  //  public static void main(String[] args) {
        //extends 키워드를 통해 Bound할 때는
        //지정한 클래스의 부모 클래스로 객체를 생성한 후,
        //사용하면 오류가 발생
    //    List<Integer> myList = new ArrayList<>();
      //  oddNumbers(myList);
    //}
   // public static void addNumbers(List<? super Number> List){//super를 사용하면 함수의 호출자가 특정 타입의 부모 타입들만 사용하도록 강제 할 수도 있음.
        //super 키워드를 통해 Bound할 때는
        //자식 클래스로 객체를 생성하고 사용할 때 오류가 발생

        //List<? super Number> List :
        //Number들을 list에 추가해준다.
        //list의 경우 Number 상위의 객체만 포함
        //?는 최소한 T의 기능까지는 구현이 보장함, 그 하위 타입인지는 관심 X
     //   for(int i=1; i<=10; i++){
          //  list.add(i);
        //}
        //MyGenericClass<Integer> exampleInteger=new MyGenericClass<>();// MyGenericClass 클래스에 사용된 타입 변수로 Integer 타입을 사용
        //Bounded Type Parameter에 의해 Number 클래스와
        //그 자식 클래스들이 아니면 사용할 수 없음
       // MyGenericClass<String> exampleString=new MyGenericClass<>();//MyGenericClass 클래스에 사용된 타입 변수로 String 타입을 사용

        //exampleInteger.setValue(1);
        //exampleString.setValue("Hello, generics!");
        //System.out.println(exampleInteger.getValue());//타입변환이 필요없음
        //System.out.println(exampleString.getValue());//타입변환이 필요없음
    //}
//}


public class GenericExample {
    public static void main(String[] args) {
        MyGenericClass<Integer> exampleInteger = new MyGenericClass<>(); // MyGenericClass 클래스에 사용된 타입 변수로 Integer 타입을 사용
        MyGenericClass<String> exampleString = new MyGenericClass<>(); //MyGenericClass 클래스에 사용된 타입 변수로 String 타입을 사용

        exampleInteger.setValue(1);
        exampleString.setValue("Hello, generics!");
        System.out.println(exampleInteger.getValue());//타입변환이 필요없음
        System.out.println(exampleString.getValue());//타입변환이 필요없음
    }
}