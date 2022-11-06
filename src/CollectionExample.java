import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        //List
        // Int 객체를 관리하는 ArrayList 생성
        //ArrayList는 내부적으로 배열을 이용하여 값을 저장
        //배열을 이용하기 때문에 index를 이용해 배열 값에 빠른 접근이 가능
        List<Integer> myArrayList=new ArrayList<>();
        //LinkedList : 하나의 데이터가 다음 데이터의 주소값을 포함하는 형식으로 저장
        //LinkedList는 ArrayList와는 다르게 불연속적으로 존재하며, 데이터들은 서로 연결되어 있음
        List<Integer> myLinkedList=new LinkedList<>();

        //Set
        //HashSet은 Set 인터페이스의 구현 클래스
        Set<Integer> myHashSet=new HashSet<>();// HashSet 생성
        //TreeSet은 HashSet과 마찬가지로 Set 인터페이스를 구현한 클래스로써 객체를 중복해서 저장할 수 없고
        //저장 순서가 유지되지 않는다는 Set의 성질을 그대로 가지고 있음
        Set<Integer> myTreeSet=new TreeSet<>();//TreeSet생성

        //Queue
        //큐는 데이터를 일시적으로 쌓아두기 위한 자료구조로 FIFO(First In First Out)의 형태
        //Enqueue : 큐 맨 뒤에 데이터 추가
        //Dequeue : 큐 맨 앞쪽의 데이터 삭제
        Queue<Integer> myPriorityQueue=new PriorityQueue<>();//int형 queue 선언
        Queue<Integer> myArrayDeque=new ArrayDeque<>();

        //Map
        //key와 value의 쌍으로 이루어진 데이터를 보관
        //HashMap은 key를 String으로, value를 Integer로 사용
        Map<String ,Integer> myHashMap=new HashMap<>();
    }
}
