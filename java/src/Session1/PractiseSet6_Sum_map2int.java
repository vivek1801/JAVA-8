package Session1;

import java.util.Arrays;
import java.util.List;

public class PractiseSet6_Sum_map2int {
    public static void main(String[] args) {
        List<Car> cars= Arrays.asList(
                new Car("Sedan", "Toyota", 4), new Car("Mini", "Honda", 5),
                new Car("Luxury", "BMW", 4)
        );
        filterByDifferentParameter(cars);
    }

    private static void filterByDifferentParameter(List<Car> cars) {
        //Cars stream of

        System.out.println(cars.stream().mapToInt(i->i.getNoOfSeat()).sum());
    }
}