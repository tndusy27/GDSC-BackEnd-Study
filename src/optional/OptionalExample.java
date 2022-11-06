package optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        MyData kim=new MyData();
        kim.setMyAge(22);
        kim.setMyName("Kim");

        //Optional.of : value가 null 인 경우 NPE 예외를 던짐
        // 반드시 값이 있어야 하는 객체인 경우 해당 메서드를 사용
        // 메서드 시그니처
        //public static <T> Optional<T> of(T value);

        //Filter
        //Optional.filter()
        //Optional.filter(Predicate)는 Optional이 갖고 있는 객체가 어떤 조건에 만족하는지 필터링하는 함수

        //filter(Predicate)는 Optional이 갖고 있는 객체에 대해서 인자로 전달된 Predicate 함수를 수행하고,
        // Predicate의 결과가 true일 때 Optional 자신을 리턴합니다. false를 리턴하면, Empty Optional(null을 갖고 있는)을 리턴

        Optional<MyData> kimopt=Optional.of(kim);
        System.out.println(kimopt.filter(a->a.getMyAge()==22));


        //Map
        //Optional 객체의 값에 어떤 수정을 가해서 다른 값으로 변경하는 메소드
        //getMyName()->대문자로 변환
        System.out.println(kimopt.map(s->s.getMyName().toUpperCase()));

        //Get
        //Optional 객체에 저장된 값을 반환함.
        //Optional 객체가 가지고 있는 value 값을 꺼내옴.
        //만약 Optional 객체에 값이 없다면 NoSuchElementException이 발생
        System.out.println(kimopt.map(s->s.getMyName().toUpperCase()).get());

        //isPresent
        //Optional이 데이터를 갖고 있지 않을 때는 null을 리턴하기 때문에, 리턴 값이 null인지 항상 확인하고 사용해야 함
        //이런 불편함을 덜기 위해, Optional.isPresent()을 사용할 수 있는데
        // 이 함수는 갖고 있는 객체가 null이 아닐 때 true를 리턴
        System.out.println(kimopt.isPresent());

        //ifPresent
        //ifPresent() 메소드는 람다식을 인자로 받아, 값이 존재할 때 그 값에 람다식을 적용
        //만약 Optional 객체에 값이 없다면 람다식이 실행되지 않음
        kimopt.ifPresent(System.out::println);

        //-----------------------
       // String nullableStr=null;
       // String neverNullStr="null이면 안됩니다!";

        //null이 아닌 값이 넘어오면 해당 값을 가진 Optional 인스턴스 반환
        //Optional<String> optNotNull=Optional.of(neverNullStr);

        //null이 넘어오면 빈 Optional 반환
        //(null이 아닌 값이 넘어오면 of와 같은 동작)
        //Optional.ofNullable
        //value가 null 인 경우 비어있는 Optional을 반환
        // 값이 null 일수도 있는 것은 해당 메서드를 사용
        //Optional<String> optNullable=Optional.ofNullable(nullableStr);

        //System.out.println(optNotNull);
        //System.out.println(optNullable);
    }
}
