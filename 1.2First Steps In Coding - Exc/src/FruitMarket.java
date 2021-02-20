import java.util.Scanner;
public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForStrawberries = Double.parseDouble(scanner.nextLine());
        double countOfBananas = Double.parseDouble(scanner.nextLine());
        double countOfOranges = Double.parseDouble(scanner.nextLine());
        double countOfRaspberries = Double.parseDouble(scanner.nextLine());
        double countOfStrawberries = Double.parseDouble(scanner.nextLine());

        double priceForRaspberries = priceForStrawberries / 2;
        double priceForOranges = priceForRaspberries - (priceForRaspberries * 0.4);
        double priceForBananas = priceForRaspberries - (priceForRaspberries * 0.8);
        double sum = (countOfBananas * priceForBananas) + (countOfOranges * priceForOranges) + (countOfRaspberries * priceForRaspberries) + (countOfStrawberries * priceForStrawberries);
        System.out.printf("%.2f", sum);
    }
}
