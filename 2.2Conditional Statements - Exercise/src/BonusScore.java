import java.util.Scanner;
public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());
        double finaleScore = 0;
        double bonusScore = 0;
        if (score <= 100) {
            bonusScore += 5;
            if (score % 2 == 0){
                bonusScore++;
            }
            if (score % 10 == 5){
                bonusScore+= 2;
            }
        }
        else if (score > 100 && score < 1000){
            bonusScore += score * 0.2;
            if (score % 2 == 0){
                bonusScore++;
            }
            if (score % 10 == 5){
                bonusScore+= 2;
            }
        }
        else{
            bonusScore += score * 0.1;
            if (score % 2 == 0){
                bonusScore++;
            }
            if (score % 10 == 5){
                bonusScore+= 2;
            }
        }
        finaleScore = score + bonusScore;
        System.out.println(bonusScore);
        System.out.println(finaleScore);
    }
}
