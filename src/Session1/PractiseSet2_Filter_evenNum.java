package Session1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PractiseSet2_Filter_evenNum {


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
        numList.stream().filter(isEvenNum).forEach(System.out::println);
        System.out.println("sum"+numList.stream().reduce(0,(a,b)-> a*b+a-b));
        }
    }

