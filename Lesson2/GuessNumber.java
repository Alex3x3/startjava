import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int guessNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        Scanner input = new Scanner(System.in);
        String gameContinue = "yes";
        while (gameContinue.equals("yes")) {
            guessNum = (int) (Math.random() * 100 + 1);
            do {
                startRound(player1);
                if (player1.getNumber() == guessNum) {
                    break;
                }

                startRound(player2);
                if (player2.getNumber() == guessNum) {
                    break;
                }
            } while (player1.getNumber() != guessNum &&
                    player2.getNumber() != guessNum);

            do {
                System.out.print("\nХотите продолжить игру? [yes/no]: ");
                gameContinue = input.nextLine();
            } while (!gameContinue.equals("yes") && !gameContinue.equals("no"));
        }
    }

    private void startRound(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nОчередь игрока: " + player.getName());
        System.out.print("Введите ваш ответ: ");
        player.setNumber(input.nextInt());
        input.nextLine();
        if (player.getNumber() < guessNum) {
            System.out.println("Число = " + player.getNumber() + " меньше того, " +
                    "что загадал компьютер");
        } else if (player.getNumber() > guessNum) {
            System.out.println("Число = " + player.getNumber() + " больше того, " +
                    "что загадал компьютер");
        } else {
            System.out.println(player.getName() + " победил");
        }
    }
}