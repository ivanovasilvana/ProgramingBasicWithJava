import java.util.Scanner;
public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width  = Double.parseDouble(scanner.nextLine());
        double workSpaceLength = 120;
        double workSpaceWidth = 70;
        double worSpace = workSpaceLength * workSpaceWidth;
        double hallway = 100;
        double descInOneRow = (int)((width * 100 - hallway) / workSpaceWidth);
        double countOfRow = (int)((length * 100)/workSpaceLength);
        int countOfSeats = (int)((descInOneRow * countOfRow) - 3);
        System.out.printf("%d", countOfSeats);
    }
}
