import java.util.Scanner;
public class WeatherForecastPartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        if (num >= 26 && num <= 35) {
            System.out.print("Hot");
        } else if (num >= 20.1 && num <= 25.9){
        System.out.print("Warm");}
        else if (num >= 15 && num <= 20){
            System.out.print("Mild");
        }
        else if (num >= 12 && num <= 14.9){
            System.out.print("Cool");
        }
        else if(num >= 5 && num <= 11.9 ){
            System.out.print("Cold");
        }
        else{
            System.out.printf("unknown");
        }
    }
}
