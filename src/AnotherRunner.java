import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    public static void main(String[] args)
    {
        // create an array with the known types
        Integer[] intsArray = {1, 2, 3, 4, 5};

        // use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        Car car1 = new Car("Impreza", 1200);
        Car car2 = new Car("Rogue", 1500);
        Car car3 = new Car("Highlander", 1800);
        Car[] carArray = {car1, car2, car3};

        ArrayList<Car> carList = new ArrayList<>(Arrays.asList(carArray));
        System.out.println(carList);
    }
}
