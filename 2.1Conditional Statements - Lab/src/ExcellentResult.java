import java.util.Scanner;

public class ExcellentResult {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double input = Double.parseDouble(scanner.nextLine());
       if (input >= 5){
           System.out.printf("Excellent!");
       }
    }
}
