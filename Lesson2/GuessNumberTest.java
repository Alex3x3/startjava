import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("\n###Guess Number Game v0.98 beta###\n");
        System.out.print("Введите имя первого игрока: ");
        Scanner input = new Scanner(System.in);
        Player player1 = new Player(input.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(input.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);

        String gameContinue = "yes";
        while (gameContinue.equals("yes")) {
            guessNumber.startRound();
            do {
                System.out.print("\nХотите продолжить игру? [yes/no]: ");
                gameContinue = input.nextLine();
            } while (!gameContinue.equals("yes") && !gameContinue.equals("no"));
        }
    }
}