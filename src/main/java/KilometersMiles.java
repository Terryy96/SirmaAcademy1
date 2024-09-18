import java.util.Scanner;

public class KilometersMiles {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double km= Double.parseDouble(scanner.nextLine());
        double mile= km*0.621371192;

        System.out.println(mile);

    }
}
