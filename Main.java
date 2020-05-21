package geekbrains_lesson_1;

public class Main {

    public static void main(String[] args) {
        Man man = new Man( 34, 25);
        Cat cat = new Cat(28, 40);
        Robot robot = new Robot(10, 50);

        Sportsmen[] sportsmen = {man, cat, robot};

        Barrier wall1 = new Wall(40);
        Barrier track1 = new Track(20);
        Barrier wall2 = new Wall(15);
        Barrier track2 = new Track(35);

        Barrier[] barriers = {wall1, track1, wall2, track2};

        for (Sportsmen sp: sportsmen) {
            for (Barrier b: barriers) {
                boolean result = b.walkThrough(sp);
            }
        }



    }
}
