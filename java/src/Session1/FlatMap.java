package Session1;

import java.util.Arrays;
import java.util.List;

public class FlatMap {
    public static void main(String...args) {
        List<String> strList=Arrays.asList("Hello", "World");
        getDistinctLetters(strList);
    }

    private static void getDistinctLetters(List<String> stringList) {
        stringList.stream().map(w-> w.toCharArray()).distinct().forEach(System.out::println);
    }
}
