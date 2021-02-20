import java.util.Scanner;
public class ToyShop {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        double priceForHoliday = Double.parseDouble(scanner.nextLine());
        int countOfPuzzles = Integer.parseInt(scanner.nextLine());
        int countOfDolls = Integer.parseInt(scanner.nextLine());
        int countOfTeddyBears = Integer.parseInt(scanner.nextLine());
        int countOfMinions = Integer.parseInt(scanner.nextLine());
        int countOfTrucks = Integer.parseInt(scanner.nextLine());

        double puzzlesPrice = countOfPuzzles * 2.6;
        double dollsPrice = countOfDolls * 3;
        double teddyBearsPrice = countOfTeddyBears * 4.1;
        double minionsPrice = countOfMinions * 8.2;
        double trucksPrice = countOfTrucks * 2;
        int count = countOfPuzzles + countOfDolls + countOfTeddyBears + countOfMinions + countOfTrucks;
        double sum = puzzlesPrice + dollsPrice + teddyBearsPrice + minionsPrice + trucksPrice;
        if (count >= 50){
            sum -= sum * 0.25;
        }
        double rent = sum * 0.1;
        double profit = sum - rent;
        double diff = Math.abs(priceForHoliday - profit);
        if (profit >= priceForHoliday){
            System.out.printf("Yes! %.2f lv left.", diff);
        }
        else{
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }

    }
}
