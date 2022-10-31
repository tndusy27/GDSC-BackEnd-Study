package thread;

import java.util.ArrayList;

public class ThreadExample extends Thread{//Thread클래스를 상속받고 run메소드를 오버라이딩한 후 스레드의 작업을 작성.
    private int order;
//스레드는 순서대로 실행 X
    //run()메소를 구현했지만 run()을 실행하면 안됨.
    //start()를 실행해주어야함.
    //start()는 쓰레드를 생성할 준비를 하고 준비가 완료되면 run()을 실행해줌.
    public ThreadExample(int order){this.order=order;}
    public void run(){//thread가 가지고 있는 run()메소드를 오버라이딩 함.
         System.out.println(this.order+"번째 스레드 시작합니다.");
        try{
            Thread.sleep(1000);//쓰레드 시작하고 1초 쉬었다 종료하는 코드
        }catch (Exception e){

        }
        System.out.println(this.order+"번째 스레드 종료합니다.");
    }
    public static void main(String[] args){
        //threadList 에 쓰레드를 삽입하고,
        //이후 threadList를 순회하며 각 쓰레드에서 join() 메소드를 실행시켜주는 것
        ArrayList<Thread> threadList=new ArrayList<>();
        for(int i=1;i<=10;i++){
            Thread thread=new ThreadExample(i);//  thread 객체 생성
            thread.start();//작업 thread 시작
            threadList.add(thread);//생성한 쓰레드를 리스트에 넣음.
        }
        for(int i=0; i<threadList.size();i++){ // 쓰레드 처리가 끝날 때 까지 기다림.
            Thread thread=threadList.get(i);
            try{
                thread.join();
            }catch (Exception e){

            }
        }
        System.out.println("main 메소드 종료합니다.");
    }
}
