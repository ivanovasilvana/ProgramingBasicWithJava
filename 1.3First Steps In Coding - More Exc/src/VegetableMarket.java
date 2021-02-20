import java.util.Scanner;
public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceForVegetables = Double.parseDouble(scanner.nextLine());
        double priceForFruits = Double.parseDouble(scanner.nextLine());
        double kilogramsVegetables = Double.parseDouble(scanner.nextLine());
        double kilogramsFruits = Double.parseDouble(scanner.nextLine());
        double sum = (priceForVegetables * kilogramsVegetables + priceForFruits * kilogramsFruits) / 1.94;
        System.out.printf("%.2f", sum);
    }
}
