import java.util.Scanner;
public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double volume =((length * width * high) / 1000.0) * (1-(percent / 100.0));
        System.out.printf("%.5f", volume);
    }
}