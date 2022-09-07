public class Wolf {

    char sex;
    String name;
    int weight;
    int age;
    String color;

    public void walk() {
        System.out.println("Волк " + name + " идет");
    }

    public void sit() {
        System.out.println("Волк " + name + " сидит");
    }

    public void run() {
        System.out.println("Волк " + name + " бежит");
    }

    public void hawl() {
        System.out.println("Волк " + name + " воет");
    }

    public void hunt() {
        System.out.println("Волк " + name + " охотится");
    }
}