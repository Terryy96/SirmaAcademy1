import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int numOne= Integer.parseInt(scanner.nextLine());
        int numTwo= Integer.parseInt(scanner.nextLine());

        System.out.printf("The sum is: %d%n", numOne+numTwo);
        System.out.printf("The difference is: %d%n", Math.abs(numOne-numTwo));
        System.out.printf("The product is: %d%n", numOne*numTwo);
        System.out.printf("The average is: %d", (numOne+numTwo)/2);

    }
}
