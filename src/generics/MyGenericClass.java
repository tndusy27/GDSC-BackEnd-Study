package generics;

public class MyGenericClass <T extends Number>{ //제네릭은 클래스나 인터페이스 이름 옆에 <>를 붙이고 타입 파라미터를 지정해 줌
    //extends 키워드를 사용하면 타입 변수에 특정 타입만을 사용하도록 제한
    //MyGenericClass는 어떤 자료형이든 입력 받을 수 있음. 불필요한 형 변환 X
    private T value; //T는 Type의 약자, 제네릭 타입 변수
    public T getValue(){ // 제네릭 타입 반환 메소드

        return value;
    }
    public void setValue(T value)// 제네릭 파라미터 메소드
    {
        this.value=value;
    }
}
