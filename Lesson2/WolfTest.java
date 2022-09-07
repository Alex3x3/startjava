public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = 'M';
        wolf.name = "Аккела";
        wolf.weight = 43;
        wolf.age = 7;
        wolf.color = "серый";

        System.out.println("Пол волка: " + wolf.sex + 
                "\nКличка волка: " + wolf.name +
                "\nВес волка: " + wolf.weight + " кг" + 
                "\nВозраст волка: " + wolf.age + " лет" +
                "\nЦвет волка: " + wolf.color);
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.hawl();
        wolf.hunt();
    }
}