import java.util.Scanner;

public class Office {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double cabinet= Double.parseDouble(scanner.nextLine());

        double second= cabinet - cabinet*0.2;
        double third= (second+cabinet)+(second+cabinet)*0.15;

        System.out.printf("%.2f", cabinet+second+third);



        //For the furnishing of the office purchased 3 cabinets.
        // One cabinet cost $n, the  second was 20% cheaper than the first,
        // and the third cost 15% more than the other two combined.
    }
}
