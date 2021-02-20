import java.util.Scanner;
public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int countOfDays = Integer.parseInt(scanner.nextLine());
        int hours = (pages/pagesPerHour) / (countOfDays);
        System.out.printf("%d", hours);
    }
}
