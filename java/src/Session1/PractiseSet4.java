package Session1;

import java.util.Arrays;
import java.util.List;

public class PractiseSet4 {
    public static void main(String[] args) {

        List<Integer> numberSet =Arrays.asList(0,2,5,3,1,6,8,10);
        numberSet.stream().mapToInt(PractiseSet4 :: waitDThread ).filter(e-> e%2==0).forEach(e->System.out.println(e));
    }

    public static int waitDThread(int s)
    {
        try {
            Thread.sleep(1000);
            System.out.println("Active Thread"+Thread.activeCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return s*3;
    }
}
