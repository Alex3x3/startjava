public class GuessNumber {

    public static void main(String[] args) {
        int numberToGuess = 36;
        int firstIndex = 1;
        int lastIndex = 100;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (middleIndex == numberToGuess) {
                System.out.println("Вы победили! Загаданное число = " + middleIndex);
                break;
            } else if (middleIndex < numberToGuess) {
                firstIndex = middleIndex + 1;
            } else if (middleIndex > numberToGuess) {
                lastIndex = middleIndex - 1;
            }

            if (middleIndex < numberToGuess) {
                System.out.println("Число = " + middleIndex + " меньше того," +
                        "что загадал компьютер");
            } else {
                System.out.println("Число = " + middleIndex + " больше того," +
                        "что загадал компьютер");
            }
        }
    }
}