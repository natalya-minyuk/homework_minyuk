package geekbrains_lesson_1;

public class Track implements Barrier {

    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean walkThrough(Sportsmen sportsmen) {
        return sportsmen.getMaxLength() >= length;
    }
}
