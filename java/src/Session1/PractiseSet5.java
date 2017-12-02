package Session1;

import java.util.Arrays;
import java.util.List;

public class PractiseSet5 {

    public static void main(String[] args) {
        List<Car> cars= Arrays.asList(
                new Car("Sedan", "Toyota", 4), new Car("Mini", "Honda", 5),
                new Car("Luxury", "BMW", 4)
        );
         filterByDifferentParameter(cars, "BMW", 4);
    }

    private static void filterByDifferentParameter(List<Car> cars, String brandName, int numOfSeats) {
         for (Car c : cars) {
             if(c.getBrandName().equalsIgnoreCase("bmw") && c.getNoOfSeat()==numOfSeats)
                 System.out.println(c.toString());
        }
    }
}
