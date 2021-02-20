import java.util.Scanner;
public class Number100to200 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        if (input < 100){
            System.out.print("Less than 100");
        }
        else if (input >= 100 && input <= 200){
            System.out.print("Between 100 and 200");
        }
        else{
            System.out.print("Greater than 200");
        }
    }
}
