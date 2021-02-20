import java.util.Scanner;
public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());
        double sum = deposit + months * ((deposit * (percentage/ 100) )/12);
        System.out.printf("%.2f", sum);
    }
}
