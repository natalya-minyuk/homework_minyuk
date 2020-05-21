package geekbrains_lesson_1;

public class Man implements Sportsmen {

    private int maxJump;
    private int maxLength;

    public Man(int maxJump, int maxLength) {
        this.maxJump = maxJump;
        this.maxLength = maxLength;
    }

    @Override
    public int getMaxJump() {
        return 0;
    }

    @Override
    public int getMaxLength() {
        return 0;
    }
}
