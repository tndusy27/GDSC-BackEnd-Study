package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("lee","han","cho");
        List<String> concatTarget=Arrays.asList("GDSC CORE");
        List<List<String>> complexList=Arrays.asList(
                //Arrays.asList()는 Arrays의 private 정적 클래스인 ArrayList를 리턴
                Arrays.asList("core","lee"),
                Arrays.asList("core","han"),
                Arrays.asList("core","cho")
        );
        List<Integer> numList = Arrays.asList(1,2,3,4,5);

        //스트림 생성하기

        Stream<String> listStream=list.stream();
        //range의 두 번째 파라미터는 범위를 포함하지 않음
        IntStream intStream=IntStream.range(1,5);//[1,2,3,4]
        //rangeClosed()를 사용 - 두 번째 파라미터는 범위를 포함
        LongStream longStream=LongStream.rangeClosed(1,5);//[1,2,3,4,5]
        Stream<String> unitedStream=Stream.concat(concatTarget.stream(),listStream);

        //Filtering
        //filter()는 인자로 함수를 받으며, 어떤 조건으로 Stream의 요소들을 필터링함
        // 여기서 인자로 전달되는 함수를 구현하여 필터링하는 조건을 설정

        //filter()를 사용하여 Stream의 요소들 중에 "h"로 시작하는 문자열들을 모두 필터링
        System.out.println(list.stream().filter(name->name.contains("h")).collect(Collectors.toList()));

        //Mapping
        //map()은 인자로 함수를 받으며, Stream의 요소를 다른 형태로 변경함
        // 인자로 전달되는 함수를 구현하여 요소를 어떻게 변경할지 설정

        //Stream의 문자열 요소들을 대문자로 변경
        System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));

        //FlatMapping
        //flatMap()은 평탄화라고 부르기도 하며,
        //복잡한 자료 구조에 저장된 요소들을 단순한 자료구조로 변환
        System.out.println(complexList.stream().flatMap(Collection::stream).map(String::toUpperCase).collect(Collectors.toList()));

        //Sorting
        //Stream.sorted()는 스트림의 요소들이 어떤 기준으로 정렬되어 전달되는 새로운 스트림 객체를 리턴
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        // Stream의 요소가 Comparable 인터페이스를 구현하지 않았다면 Stream.sorted(Comparator) 처럼 Comparator를 구현하여 인자로 전달
        //역순으로 정렬 .reversed()
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        //Iterating
        //Collectors.joining() 메서드는 Collector 입력 요소를 단일 문자열로 연결
        list.stream().peek(System.out::print).collect(Collectors.joining());
        System.out.println();

        //  스트림 결과 만들기
        long count = intStream.count();
        System.out.println(count);
        long sum=longStream.sum();
        System.out.println(sum);

        System.out.println(numList.stream().reduce(0,Integer::sum));

        System.out.println(list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())   );

        System.out.println(list.stream().allMatch(s->s.length()==3));

        list.stream().forEach(System.out::println);


    }
}
