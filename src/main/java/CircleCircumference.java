import java.util.Scanner;

public class CircleCircumference {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int r= Integer.parseInt(scanner.nextLine());
        double circumference=2*Math.PI*r;

        System.out.printf("%.2f", circumference);

    }
}
