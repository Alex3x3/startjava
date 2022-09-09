import java.util.Scanner;

public class GuessNumber {

    public void startRound(Player player, int guessNum) {
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