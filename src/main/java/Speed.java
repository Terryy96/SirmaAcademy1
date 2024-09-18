import java.util.Scanner;

public class Speed {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int distance= Integer.parseInt(scanner.nextLine());
        int hour= Integer.parseInt(scanner.nextLine());
        int min= Integer.parseInt(scanner.nextLine());
        int sec= Integer.parseInt(scanner.nextLine());
        int totalSec=hour *3600 +min *60 +sec;

        double v= (double) distance/ totalSec;

        System.out.printf("%f", v);
    }
}
