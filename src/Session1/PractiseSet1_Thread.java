package Session1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PractiseSet1_Thread {

    public  static int multiplyBy2(int num)
    {
        try {
            System.out.println("Current Thread Id :: "+ Thread.currentThread().getId());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return num*2;
    }
    public static void main(String[] args) {
        List<Integer> numList= Arrays.asList(4,2,3,42,1,8,9);
        //Using Parallel Stream
        List<Integer> fout=numList.parallelStream().filter(i-> i%2==0).map(PractiseSet1_Thread:: multiplyBy2).collect(Collectors.toList());
        fout.forEach(System.out::println);
    }
}
