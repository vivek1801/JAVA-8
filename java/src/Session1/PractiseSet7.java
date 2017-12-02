package Session1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class PractiseSet7 {


    public static void main(String[] args) {
        List<Integer> numList= Arrays.asList(2,4,6,3,1);
        checkTheNum(numList, new Predicate<Integer>(){
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        });

    }

    private static void checkTheNum(List<Integer> numList, Predicate<Integer> isEvenNum) {
        numList.stream().filter(isEvenNum).map(i -> i*2).forEach(System.out::println);
        List<Integer> collectedList=numList.stream().filter(isEvenNum).map(i -> i*2).collect(toList());
        collectedList.forEach(System.out::println);

    }
}


