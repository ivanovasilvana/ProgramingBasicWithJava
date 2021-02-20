import java.util.Scanner;
public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine()); // височина на къщата
        double y = Double.parseDouble(scanner.nextLine()); // дължина на страничната стена
        double h = Double.parseDouble(scanner.nextLine()); //височина на триъгълната стена на покрива
        double backWall = x * x;
        double frontWall = x * x - 1.2 * 2;
        double sideWall = (2 * x * y) - (2* 1.5 * 1.5);
        double roof = (2 * x * y) + 2 * (x * h) / 2;
        double green = (backWall + frontWall + sideWall) / 3.4;
        double red = roof / 4.3;
        System.out.printf("%.2f%n%.2f", green, red);
    }
}
