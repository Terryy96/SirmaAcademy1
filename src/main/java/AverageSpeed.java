import java.util.Scanner;

public class AverageSpeed {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int distance=Integer.parseInt(scanner.nextLine());
        int time=Integer.parseInt(scanner.nextLine());

        double averageSpeed= (double) distance/time;

        System.out.printf("%.2f", averageSpeed);

    }
}
