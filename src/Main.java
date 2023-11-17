import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double first ,second,third;
        double total;


        System.out.println("First Number: ");
        first = scan.nextDouble();
        scan.nextLine();
        System.out.println("Second Number: ");
        second = scan.nextDouble();
        scan.nextLine();
        System.out.println("Third Number: ");
        third = scan.nextDouble();
        scan.nextLine();

        total = (first + second + third)/3.0;


        System.out.println("Total is: " + total);
    }
}