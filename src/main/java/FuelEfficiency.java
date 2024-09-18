import java.util.Scanner;

public class FuelEfficiency {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double distance=Double.parseDouble(scanner.nextLine());
        double fuel=Double.parseDouble(scanner.nextLine());
        double fuelEfficiency= distance/fuel;

        System.out.printf("%.2f", fuelEfficiency);

    }
}
