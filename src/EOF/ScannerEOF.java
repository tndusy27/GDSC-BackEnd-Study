package EOF;
import java.util.Scanner;

public class ScannerEOF {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()) { //hasNext(): 이 메소드는 Scanner가 더 읽어들일 Line이 있는지를 체크하여 true/false를 리턴
            // 이 메소드는 더 읽어들일 Line이 있는지 검사만 할 뿐, 실제로 값을 읽어들이지는 않음.
            System.out.println(scan.nextLine());
            //hasNextLine()으로 더 읽어들일 Line이 있는지 while의 조건문에서 검사한 후,
            //읽어들일 값이 있으면 (hasNextLine()의 결과가 true이면)
            //while 문의 body에서 nextLine() 메소드를 이용하여
            //실제 값을 읽도록 처리
        }
        System.out.println("Scanner EOF");//데이터 입력의 끝 EOF
    }
}
