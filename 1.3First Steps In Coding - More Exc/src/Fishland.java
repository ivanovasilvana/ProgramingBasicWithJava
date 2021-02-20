import javax.sql.rowset.serial.SerialJavaObject;
import java.util.Scanner;
public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceForMackerel = Double.parseDouble(scanner.nextLine());           //скумрия
        double priceForToy = Double.parseDouble(scanner.nextLine());                //цаца
        double kilogramsBonito = Double.parseDouble(scanner.nextLine());            //паламуд
        double kilogramsHorseMackerel = Double.parseDouble(scanner.nextLine());     //сафрид
        double kilogramsMussels = Double.parseDouble(scanner.nextLine());           //миди

        double priceForBonito = priceForMackerel + (priceForMackerel * 0.6);
        double priceForHorseMackerel = priceForToy + (priceForToy * 0.8);
        double priceForMussels = 7.5;
        double sum = priceForHorseMackerel * kilogramsHorseMackerel + priceForBonito * kilogramsBonito + priceForMussels * kilogramsMussels;

        System.out.printf("%.2f", sum);
    }
    }
