package exception;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int A=scan.nextInt(); // int를 입력 받을 때는 nextInt 메서드 사용
        int B=scan.nextInt(); // int를 입력 받을 때는 nextInt 메서드 사용.
        int result;

        try{ //try {실행코드} ->try 안에는 예외 상황이 발생할 것으로 예상되는 로직을 위치시킴.
             // catch(예외유형)
            //  {예외 발생시 실행코드}
            result = A/B;
            System.out.println(result);
        }catch (Exception e){ //0으로 나눌 수 없을 때 -> catch 안에는 예외가 발생했을 때 뒷수습을 하기 위한 로직이 위치.
            System.out.println("0으로는 나눌 수 없습니다.");
        }finally{ //무조건 실행
            System.out.println("정말 재미있는 JAVA 스터디!");
        }
    }
}
