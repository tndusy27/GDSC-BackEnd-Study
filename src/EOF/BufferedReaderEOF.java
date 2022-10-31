package EOF;

import java.io.*;

public class BufferedReaderEOF {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //효율적으로 문자를 읽어들이기 위해서 버퍼링을 해줌. BufferedReader는 인자로 취한 Reader 스트림에 버퍼링기능을 추가한 입력스트림 클래스
        //키보드와 같은 사용자로부터 입력을 받는 표준입력스트 객체를 나타냄.
        // 그래서, System.in의 리턴값은 InputStream임.
        //※ InputStream : 입력스트림으로 부터,데이터를 byte단위로 읽어오는 byte stream임.
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        //*BufferedWriter :
        //한번에 모았다가 출력이 가능.
        //버퍼를 정의해줬기 때문에 반드시 flush()/close()를 호출해 뒤처리를 해줘야함.
        //System.out.println() 처럼 자동개행 기능이 없기 때문에 개행이 필요한 경우 \n 을 통해 따로 처리해 주어야함.
        String str="";
        while ((str=br.readLine())!=null){ //readLine()과 같이 한 줄씩읽어오는 메소드를 제공.
            bw.write(str+"\n");//출력
        }
        bw.write("BufferedReader EOF");
        bw.flush();//버퍼에 남아있는 내용들을 모두 출력. 꼭 필요한 과정
        bw.close();//write로 담은 내용 출력 후, 버퍼를 비움.
        bw.close();//write로 담은 내용 출력 후, 버퍼를 비움.
    }
    //버퍼를 이용한 BufferedReader와 BufferedWriter를 이용한 입출력이
    // Scanner와 System.out.println()를 이용한 입출력보다 속도와 효율성 면에서 좋음.
}
