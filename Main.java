package geekbrains_lesson_1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Man man = new Man( 34, 25);
        Cat cat = new Cat(28, 40);
        Robot robot = new Robot(10, 50);

        Sportsmen[] sportsmen = {man, cat, robot};

        Barrier wall1 = new Wall(4);
        Barrier track1 = new Track(20);
        Barrier wall2 = new Wall(15);
        Barrier track2 = new Track(35);

        Barrier[] barriers = {wall1, track1, wall2, track2};

       boolean result;

        for (Sportsmen sp: sportsmen) {
            System.out.println(sp.getName() + " выходит на дистанцию!");
            for (Barrier b: barriers) {
                result = b.walkThrough(sp);
                if (result == true) {
                    System.out.println(sp.getName() + " успешно проходит барьер " + b.getNameBarrier());
                } else {
                    System.out.println(sp.getName() + " не смог пройти барьер " + b.getNameBarrier() + ". " + sp.getName() + " сходит с дистанции!");
                    break;

                }
            }
        }





    }
}
