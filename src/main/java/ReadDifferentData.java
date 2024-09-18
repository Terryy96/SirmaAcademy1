import java.util.Scanner;

public class ReadDifferentData {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String text = scanner.nextLine();
        char character= scanner.nextLine().charAt(0);
        int num= Integer.parseInt(scanner.nextLine());
        double realNum= Double.parseDouble(scanner.nextLine());

        System.out.println(text);
        System.out.println(character);
        System.out.println(num);
        System.out.println(realNum);

        System.out.printf("%s , %c, %d, %f", text, character, num, realNum);
    }
}
