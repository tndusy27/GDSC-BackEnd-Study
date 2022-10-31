package exception;
import java.util.Scanner;
//throw : 강제로 예외를 발생
//throws : 호출한 영역으로 예외처리를 던짐
public class ThrowExample { // Throw : 예외를 던져주는 코드
                            //throw new 발생시킬 예외
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Java 스터디는 재미있습니까? (1 Yes / 2 No) : ");
        int choice=scan.nextInt();//입력 받음
       if(choice==1){
            throw new NotFunnyException(); // throw new 발생시킬 예외(NotFunnyException())
        }else {
            System.out.println("저도 집에 가고 싶습니다. ");
        }
    }
}

//사용자 정의 예외 클래스 선언
// 상속받을 수 있는 Exception 클래스에는 두 가지가 있음
//RuntimeException : 실행 시 발생하는 예외
// Exception : 컴파일 시 발생하는 예외
class NotFunnyException extends RuntimeException{
    NotFunnyException(){
        super("공부는 항상 재미 없습니다.");
    }
}
