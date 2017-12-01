package Session3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleFlatMap {
    public static void main(String...args) {
        List<String> strList=Arrays.asList("Hello", "World");
        getDistinctLetters(strList);
        getDistinctUsingFlatMapLetters(strList);
    }

    private static void getDistinctUsingFlatMapLetters(List<String> strList) {
        strList.parallelStream().map(w-> w.split("")).flatMap(Arrays::stream).distinct().forEach(System.out::println);
    }

    private static void getDistinctLetters(List<String> stringList) {
        //Stream<Stream<String>
        //List<String> ds= stringList.stream().map(w-> w.split("")).collect(toList());
    }
}
