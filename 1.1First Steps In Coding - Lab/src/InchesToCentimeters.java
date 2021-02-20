import java.util.Scanner;
public class InchesToCentimeters {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double inches = scanner.nextDouble();
        double santimetres = inches * 2.54;
        System.out.println(santimetres);
    }
}
