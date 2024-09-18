import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int min= Integer.parseInt(scanner.nextLine());

        int h= min/60;
        int m= min %60;

        System.out.printf("%02d:%02d", h, m);
    }
}
