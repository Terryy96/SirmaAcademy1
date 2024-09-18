import java.util.Scanner;

public class WeatherForecast {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String town= scanner. nextLine();
        double degree= Double.parseDouble(scanner.nextLine());
        System.out.printf("Today in %s it is %.2f degrees.", town, degree);
    }
}
