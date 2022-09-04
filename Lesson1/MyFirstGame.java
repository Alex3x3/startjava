public class MyFirstGame {

    public static void main(String[] args) {
        int guessNum = 36;
        int firstIndex = 1;
        int lastIndex = 100;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (middleIndex == guessNum) {
                System.out.println("Вы победили! Загаданное число = " + middleIndex);
                break;
            } else if (middleIndex < guessNum) {
                firstIndex = middleIndex + 1;
            } else if (middleIndex > guessNum) {
                lastIndex = middleIndex - 1;
            }

            if (middleIndex < guessNum) {
                System.out.println("Число = " + middleIndex + " меньше того," +
                        "что загадал компьютер");
            } else {
                System.out.println("Число = " + middleIndex + " больше того," +
                        "что загадал компьютер");
            }
        }
    }
}