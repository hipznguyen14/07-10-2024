import static java.nio.file.Files.walk;

public class Main {
    public static void main(String[] args) {
        swim();
        walk();
    }

    private static void swim() {
        Pig p = new Pig();
        p.swim();
        Fish f = new Fish();
        f.swim();
        Duck d = new Duck();
        d.swim();
    }
    private static void walk() {
        Pig p = new Pig();
        p.walk();
        Fish f = new Fish();
        f.walk();
        Duck d = new Duck();
        d.walk();
    }

}
