package geekbrains_lesson_1;

public class Cat implements Sportsmen {

    private int maxJump;
    private int maxLength;

    public Cat(int maxJump, int maxLength) {
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
        return "Кот";
    }
}
