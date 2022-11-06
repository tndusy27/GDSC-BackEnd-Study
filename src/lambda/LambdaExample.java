package lambda;

import java.util.Scanner;

public class LambdaExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();

        ////람다식 : 메서드를 하나의 ‘식(expression)’으로 표현한 것
        //(매개변수 선언) ->  {
        //  ...
        //}
        //두 값 중 큰 값을 반환하는 람다식
        PrintResult pr = (a,b) -> a > b ? a : b;// 추상 메소드의 구현

        System.out.println(pr.printResult(num1,num2));// 함수형 인터페이스의 사용

    }
}
//함수형 인터페이스 람다 사용예제
//@FunctionalInterface 어노테이션을 반드시 명시하여 정의함
@FunctionalInterface
interface PrintResult{ // 함수형 인터페이스의 선언
    int printResult(int a, int b);
}