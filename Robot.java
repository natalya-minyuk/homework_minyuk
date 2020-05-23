package geekbrains_lesson_1;

public class Robot implements Sportsmen {

    private int maxJump;
    private int maxLength;

    public Robot(int maxJump, int maxLength) {
        this.maxJump = maxJump;
        this.maxLength = maxLength;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public String getName() {
        return "Робот";
    }
}
