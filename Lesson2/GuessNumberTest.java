import java.util.Scanner;

public class GuessNumberTest {

    private Player player1;
    private Player player2;
    private int guessNum;

    public GuessNumberTest(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        guessNum = (int) (Math.random() * 100 + 1);
    }

    public static void main(String[] args) {
        System.out.println("\n###Guess Number Game v0.98 beta###\n");
        System.out.print("Введите имя первого игрока: ");
        Scanner input = new Scanner(System.in);
        Player player1 = new Player(input.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(input.nextLine());

        String gameContinue = "yes";
        while (gameContinue.equals("yes")) {
            GuessNumberTest game = new GuessNumberTest(player1, player2);
            GuessNumber round = new GuessNumber();
            do {
                round.startRound(game.player1, game.guessNum);
                if (game.player1.getNumber() == game.guessNum) {
                    break;
                }

                round.startRound(game.player2, game.guessNum);
                if (game.player2.getNumber() == game.guessNum) {
                    break;
                }
            } while (game.player1.getNumber() != game.guessNum &&
                game.player2.getNumber() != game.guessNum);

            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                gameContinue = input.nextLine();
            } while (!gameContinue.equals("yes") && !gameContinue.equals("no"));
        }
    }
}