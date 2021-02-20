import java.util.Scanner;
public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfDays = Integer.parseInt(scanner.nextLine());
        int countOfCooker = Integer.parseInt(scanner.nextLine());
        int countOfCake = Integer.parseInt(scanner.nextLine());
        int countOfWaffles = Integer.parseInt(scanner.nextLine());
        int countOfPancakes = Integer.parseInt(scanner.nextLine());
        double sum = (countOfCake * 45 + countOfWaffles * 5.8 + countOfPancakes * 3.2) * countOfDays * countOfCooker;
        double finaleSum = sum - sum/8;
        System.out.printf("%.2f", finaleSum);
    }
}
