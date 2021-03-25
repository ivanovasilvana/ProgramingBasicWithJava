import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();
        double result = 0;

        if (input.equals("m")) {
            if (output.equals("cm")) {
                result = num * 100;
            } else if (output.equals("mm")) {
                result = num * 1000;
            }
        } else if (input.equals("cm")) {
            if (output.equals("mm")) {
                result = num * 10;
            } else if (output.equals("m")) {
                result = num / 100;
            }
        } else if (input.equals("mm")) {
            if (output.equals("m")) {
                result = num / 1000;
            } else if (output.equals("cm")) {
                result = num / 10;
            }
        }
        System.out.printf("%.3f", result);
    }
}
