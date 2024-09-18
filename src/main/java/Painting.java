import java.util.Scanner;

public class Painting {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int paint= Integer.parseInt(scanner.nextLine());
        int singleRoom=paint/3;
        double red = (double)  singleRoom/13;
        double white = 8*red;
        double yellow =  4*red;


        System.out.printf("Red: %f%n", red);
        System.out.printf("Yellow: %f%n", yellow);
        System.out.printf("White: %f%n", white);



        //For the painting of 3 rooms they spent n  kg of paint (equally for each room).
        // To get the desired color, they mixed yellow, red and white paint.
        // The yellow paint was 4 times more than the red and 2 times less than the white.
        // How many kilograms of each color did they spend on painting a room?
    }
}
