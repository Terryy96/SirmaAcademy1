import java.util.Scanner;

public class WaterConsumption {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double totalConsumption= Double.parseDouble(scanner.nextLine());
        int people=Integer.parseInt(scanner.nextLine());

        double consPerPerson= totalConsumption/7/people;

        System.out.printf("%.2f", consPerPerson);

    }
}
