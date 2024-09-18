import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int units=Integer.parseInt(scanner.nextLine());
        double ratePerUnit=Double.parseDouble(scanner.nextLine());

        double totalBill= (double) (units*ratePerUnit) +10;

        System.out.printf("%.2f", totalBill);

    }
}
