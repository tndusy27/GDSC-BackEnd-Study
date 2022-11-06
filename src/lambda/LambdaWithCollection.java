package lambda;

import java.util.*;

public class LambdaWithCollection { //Java의 Collection에서 정렬하고자 할 때
    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();
        myList.add("Java");
        myList.add("Python");
        myList.add("C");

        //오름차순 정렬 ,compareTo() 함수는 "문자열의 비교" , "숫자의 비교" 두 방식이 존재
        Collections.sort(myList,(s1,s2)-> s1.compareTo(s2));
        //Collections.sort(myList,String::compareTo); 이것도 가능
        for(String s:myList){
            System.out.println(s);
        }
        System.out.println();
    }
}
