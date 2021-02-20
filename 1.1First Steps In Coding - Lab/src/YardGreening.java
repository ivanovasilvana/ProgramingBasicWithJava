import java.util.Scanner;
public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMetres = Double.parseDouble(scanner.nextLine());
        double price = squareMetres * 7.61;
        double discount = price * 0.18;
        double finalePrice = price - discount;
        System.out.printf("The final price is: %.2f lv.%n", finalePrice);
        System.out.printf("The discount is: %.2f lv.", discount);

    }
}
