package Session1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Prime_Num_Stream {
    public static void main(String[] args) {
        List<Integer> numList= Arrays.asList(2,4,6,3,1,11);
        checkThePrimeNum(numList, new Predicate<Integer>(){
            @Override
            public boolean test(Integer integer) {
                boolean isPrime = false;
                for (int i = 2; i < integer; i++) {
                    isPrime = integer % i != 0;
                    break;
                }
                return isPrime;
            }
        });

    }

    /**
     * @param numList
     * @param isPrimeNum
     */
    private static void checkThePrimeNum(List<Integer> numList, Predicate<Integer> isPrimeNum) {
        numList.stream().filter(i-> i>1).filter(i -> isPrimeNum.test(i)).forEach(System.out::println);
    }
}
