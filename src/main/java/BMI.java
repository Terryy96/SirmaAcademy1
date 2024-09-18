import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double kg= Double.parseDouble(scanner.nextLine());
        double height= Double.parseDouble(scanner.nextLine());
        double bmi=kg/(height*height);

        System.out.printf("%.2f", bmi);
    }
}
