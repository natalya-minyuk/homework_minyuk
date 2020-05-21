package geekbrains_lesson_1;

public class Wall implements Barrier {
    private int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public boolean walkThrough(Sportsmen sportsmen) {
        return sportsmen.getMaxJump() >= heigth;
    }
}
