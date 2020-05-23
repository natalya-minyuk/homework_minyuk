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

    @Override
    public String getParam() {
        return "length " + this.length;
    }

    @Override
    public String getNameBarrier() {
        return "беговая дорожка";
    }


}
