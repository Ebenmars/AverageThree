import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double first ,second,third;
        double total;


        System.out.println("Input Numbers: ");
        first = scan.nextDouble();
        second = scan.nextDouble();
        third = scan.nextDouble();
        scan.nextLine();


        total = (first + second + third)/3.0;


        System.out.println("Total is: " + total);
    }
}