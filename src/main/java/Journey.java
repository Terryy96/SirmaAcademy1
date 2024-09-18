import java.util.Scanner;

public class Journey {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //Enter the speed of Car 1 (x in km/h):
        double x= Double.parseDouble(scanner.nextLine());

        //Enter the speed of Car 2 (y in km/h):
        double y= Double.parseDouble(scanner.nextLine());

        // Calculate the total distance traveled by each car
        double distanceCar1 = 5 * x;  // Car 1 travels for 5 hours in total
        double distanceCar2 = 3 * y;  // Car 2 travels for 3 hours

        // Calculate the distance between the two cars
        double distanceBetween = Math.abs(distanceCar1 - distanceCar2);

        // Output the distance between the two cars
        System.out.printf("%.2f", distanceBetween);
    }
}
