import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int guessNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        guessNum = (int) (Math.random() * 100 + 1);
        do {
            makeMove(player1);
            if (player1.isWinner()) {
                break;
            }

            makeMove(player2);
            if (player2.isWinner()) {
                break;
            }
        } while (!player1.isWinner() && !player2.isWinner());
    }

    private void makeMove(Player player) {
        Scanner console = new Scanner(System.in);
        System.out.println("\nОчередь игрока: " + player.getName());
        System.out.print("Введите ваш ответ: ");
        player.setNumber(console.nextInt());
        console.nextLine();
        player.setWinner(false);
        if (player.getNumber() < guessNum) {
            System.out.println("Число = " + player.getNumber() + " меньше того, " +
                    "что загадал компьютер");
        } else if (player.getNumber() > guessNum) {
            System.out.println("Число = " + player.getNumber() + " больше того, " +
                    "что загадал компьютер");
        } else {
            System.out.println(player.getName() + " победил");
            player.setWinner(true);
        }
    }
}