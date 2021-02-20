import java.util.Scanner;
public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfDogs = scanner.nextInt();
        int countOfAnimals = scanner.nextInt();
        double priceForDogs = countOfDogs * 2.5;
        double priceForAnimals = countOfAnimals * 4;
        double price = priceForAnimals + priceForDogs;

        System.out.printf("%.1f lv.", price);
    }
}
