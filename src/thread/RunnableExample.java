package thread;

import java.util.ArrayList;

public class RunnableExample implements Runnable { //인터페이스 구현하는 방법, ( implements Runnable)
    //1. run()메소드를 오버라이드하여 구현
    //2. 별도의 thread를 생성해주고
    //3. 구현한 Runnable인터페이스를 인자로 넘겨주어야 함.
    private int order;
    //스레드는 순서대로 실행 X
    public RunnableExample(int order)
    {
        this.order = order;
    }
    @Override
    public void run() {
        System.out.println(this.order + "번째 스레드 시작합니다.");
        try{
            Thread.sleep(1000);
        }catch(Exception e){

        }
        System.out.println(this.order+"번째 스레드 종료합니다.");
    }
    public static void main(String[] args) {
        // Thread 인스턴스를 생성할때 생성자의 매개값으로 Runnable 구현 객체를 넘겨주고
        // 생성한 Thread 인스턴스의 start() 메소드를 호출
        ArrayList<Thread> threadList = new ArrayList<>();// 쓰레드를 담을 객체
        for(int i = 1; i <= 10; i++){
            Thread thread = new Thread(new RunnableExample(i));
            thread.start();// 이 메소드를 실행하면 Thread 내에 run()을 수행
            threadList.add(thread);// 생성한 쓰레드를 리스트에 삽입
        }
        // threadList 에 쓰레드를 삽입하고,
        // 이후 threadList를 순회하며 각 쓰레드에서 join() 메소드를 실행시켜주는 것
        for(int i = 0; i < threadList.size(); i++){
            Thread thread = threadList.get(i);
            try{
                thread.join();//Thread가 종료될 때까지 기다리게 하는 메소드
            }catch(Exception e){

            }
        }
        System.out.println("main 메소드 종료합니다.");
    }
}